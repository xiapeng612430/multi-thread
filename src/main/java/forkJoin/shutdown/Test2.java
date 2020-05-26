package forkJoin.shutdown;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 09:49
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            MyRunnableA myRunnableA = new MyRunnableA();
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            forkJoinPool.submit(myRunnableA);
            Thread.sleep(1000);
            forkJoinPool.shutdown();
            System.out.println("main end");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
