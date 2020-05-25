package forkJoin.test1;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/25
 * @time 15:22
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new MyRecursiveAction());
        Thread.sleep(5000);
    }
}
