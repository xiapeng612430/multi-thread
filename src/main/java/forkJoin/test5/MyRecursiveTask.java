package forkJoin.test5;

import java.util.Map;
import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/25
 * @time 18:46
 */
public class MyRecursiveTask extends RecursiveTask<String> {

    private int beginValue;
    private int endValue;

    public MyRecursiveTask(int beginValue, int endValue) {
        this.beginValue = beginValue;
        this.endValue = endValue;
    }

    @Override
    protected String compute() {
        System.out.println(Thread.currentThread().getName() + " --------- ");
        if (endValue - beginValue > 2) {
            int middleValue = (beginValue + endValue) / 2;
            MyRecursiveTask leftTask = new MyRecursiveTask(beginValue, middleValue);
            MyRecursiveTask rightTask = new MyRecursiveTask(middleValue + 1, endValue);
            invokeAll(leftTask, rightTask);
            return leftTask.join() + rightTask.join();
        } else {
            String returnString = "";
            for (int i = beginValue; i <= endValue; i++) {
                returnString = returnString + i;
            }
            System.out.println("else return string : " + returnString + " " + beginValue + " " + endValue);
            return returnString;
        }
    }
}
