package forkJoin.exception;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/27
 * @time 16:19
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask forkJoinTask = forkJoinPool.submit(myRecursiveTask);
        System.out.println(forkJoinTask.isCompletedAbnormally() + " " + forkJoinTask.isCompletedNormally());
        Thread.sleep(2000);
        System.out.println(forkJoinTask.isCompletedAbnormally() + " " + forkJoinTask.isCompletedNormally());
        System.out.println(forkJoinTask.getException());
    }
}
