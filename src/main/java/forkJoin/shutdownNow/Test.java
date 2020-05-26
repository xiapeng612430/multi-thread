package forkJoin.shutdownNow;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 10:44
 */
public class Test {

    public static void main(String[] args) throws InterruptedException{
            MyRunnableA myRunnableA = new MyRunnableA();
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            forkJoinPool.submit(myRunnableA);
            Thread.sleep(2000);
            forkJoinPool.shutdownNow();
            System.out.println("main end");
            Thread.sleep(Integer.MAX_VALUE);

    }
}
