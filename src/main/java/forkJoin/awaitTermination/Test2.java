package forkJoin.awaitTermination;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * @date 2020/05/26
 * @time 17:24
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableA myRunnableA = new MyRunnableA();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(myRunnableA);
        forkJoinPool.shutdown();
        System.out.println("run begin " + System.currentTimeMillis());
        System.out.println(forkJoinPool.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("run   end " + System.currentTimeMillis());
    }
}
