package forkJoin.awaitTermination;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * @date 2020/05/26
 * @time 17:29
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableB myRunnableB = new MyRunnableB();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(myRunnableB);
        forkJoinPool.shutdown();
        System.out.println("A: " + forkJoinPool.awaitTermination(1, TimeUnit.SECONDS));
        System.out.println("B: " + forkJoinPool.awaitTermination(1, TimeUnit.SECONDS));
    }
}
