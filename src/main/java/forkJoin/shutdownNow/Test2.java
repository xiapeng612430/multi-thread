package forkJoin.shutdownNow;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 14:36
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnableA myRunnableA = new MyRunnableA();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(myRunnableA);
        Thread.sleep(2000);
        forkJoinPool.shutdownNow();
        forkJoinPool.submit(myRunnableA);
    }
}
