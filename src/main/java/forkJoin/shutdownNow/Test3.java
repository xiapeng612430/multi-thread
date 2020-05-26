package forkJoin.shutdownNow;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 14:41
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException{
        MyRunnableB myRunnableB = new MyRunnableB();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(myRunnableB);
        Thread.sleep(1000);
        forkJoinPool.shutdownNow();
        System.out.println("main end");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
