package forkJoin.test6;

import java.util.concurrent.RecursiveTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 9:38 下午
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask(int beginPosition, int endPosition) {
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
        System.out.println(">>> " + beginPosition + " " + endPosition);
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName() + " ---------- ");
        Integer sum = 0;
        System.out.println("compute = " + beginPosition + " " + endPosition);
        if (endPosition - beginPosition != 0) {
            System.out.println("endPosition - beginPosition != 0");
            int middlePosition = (beginPosition + endPosition) / 2;
            System.out.println("left task param : " + beginPosition + " " + endPosition);
            MyRecursiveTask leftTask = new MyRecursiveTask(beginPosition, middlePosition);
            System.out.println("right task param : " + (middlePosition + 1) + " " + endPosition);
            MyRecursiveTask rightTask = new MyRecursiveTask(middlePosition + 1, endPosition);
            invokeAll(leftTask, rightTask);

            return leftTask.join() + rightTask.join();
        } else {
            return endPosition;
        }
    }
}
