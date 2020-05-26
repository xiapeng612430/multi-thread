package forkJoin.awaitTermination;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * @date 2020/05/26
 * @time 17:37
 */
public class Test4 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableA myRunnableA = new MyRunnableA();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(myRunnableA);
        forkJoinPool.shutdown();
        System.out.println("A " + System.currentTimeMillis());
        System.out.println(forkJoinPool.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS));
        System.out.println("B " + System.currentTimeMillis());
    }
}
