package forkJoin.test7;

import java.util.concurrent.RecursiveTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 10:44 下午
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    private int beginPosition;
    private int endPosition;

    public MyRecursiveTask(int beginPosition, int endPosition) {
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
        System.out.println("# " + beginPosition + " " + endPosition);
    }

    @Override
    protected Integer compute() {
        System.out.println("compute = " + beginPosition + " " + endPosition);
        if ((endPosition - beginPosition) > 2) {
            System.out.println("(endPosition - beginPosition) > 2...... " + endPosition + " " + beginPosition);
            int middlePosition = (endPosition + beginPosition) / 2;
            System.out.println("left task param : " + beginPosition + " " + endPosition);
            MyRecursiveTask leftTask = new MyRecursiveTask(beginPosition, middlePosition);
            System.out.println("right task param : " + (middlePosition + 1) + " " + endPosition);
            MyRecursiveTask rightTask = new MyRecursiveTask(middlePosition + 1, endPosition);
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
