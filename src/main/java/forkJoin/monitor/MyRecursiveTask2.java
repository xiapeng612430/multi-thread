package forkJoin.monitor;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/27
 * @time 14:47
 */
public class MyRecursiveTask2 extends RecursiveTask<Integer> {

    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask2(int beginPosition, int endPosition) {
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
    }

    @Override
    protected Integer compute() {
        if (endPosition - beginPosition > 2) {
            int middlePosition = (beginPosition + endPosition) / 2;
            MyRecursiveTask2 leftTask = new MyRecursiveTask2(beginPosition, middlePosition);
            MyRecursiveTask2 rightTask = new MyRecursiveTask2(middlePosition + 1, endPosition);
            invokeAll(leftTask, rightTask);
            return leftTask.join() + rightTask.join();
        } else {
            int count = 0;
            for (int i = beginPosition; i <= endPosition; i++) {
                count = count + i;
            }
            return count;
        }

    }
}
