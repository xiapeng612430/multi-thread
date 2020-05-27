package forkJoin.monitor;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/27
 * @time 14:47
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask(int beginPosition, int endPosition) {
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
    }

    @Override
    protected Integer compute() {
        if (endPosition - beginPosition > 2) {
            int middlePosition = (beginPosition + endPosition) / 2;
            MyRecursiveTask leftTask = new MyRecursiveTask(beginPosition, middlePosition);
            MyRecursiveTask rightTask = new MyRecursiveTask(middlePosition + 1, endPosition);
            leftTask.fork();
            rightTask.fork();
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
