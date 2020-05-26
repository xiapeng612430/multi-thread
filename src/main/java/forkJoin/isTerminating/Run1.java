package forkJoin.isTerminating;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/26
 * @time 14:48
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
                    String newString = new String();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                    Math.random();
                }
            }
        };

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask forkJoinTask = forkJoinPool.submit(runnable);

        Thread.sleep(500);
        System.out.println("A " + forkJoinPool.isTerminating());
        forkJoinPool.shutdown();
        System.out.println("B " + forkJoinPool.isTerminating());
        System.out.println(forkJoinTask.get());
        Thread.sleep(1000);
        System.out.println("C " + forkJoinPool.isTerminated());
    }
}
