package forkJoin.test2;

import java.util.concurrent.RecursiveAction;

/**
 * @date 2020/05/25
 * @time 15:52
 */
public class MyRecursiveAction extends RecursiveAction {

    private int beginValue;
    private int endValue;

    public MyRecursiveAction(int beginValue, int endValue) {
        this.beginValue = beginValue;
        this.endValue = endValue;
    }

    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName() + "----------");
        if (endValue - beginValue > 2) {
            int middleValue = (beginValue + endValue) / 2;
            MyRecursiveAction leftAction = new MyRecursiveAction(beginValue, middleValue);
            MyRecursiveAction rightAction = new MyRecursiveAction(middleValue + 1, endValue);
            invokeAll(leftAction, rightAction);
        } else {
            System.out.println("print " + beginValue + " - " + endValue);
        }
    }
}
