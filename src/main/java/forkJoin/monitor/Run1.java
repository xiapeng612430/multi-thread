package forkJoin.monitor;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/27
 * @time 14:32
 */
public class Run1 {

    public static void main(String[] args) {
        MyRecursiveActionA myRecursiveActionA1 = new MyRecursiveActionA();
        MyRecursiveActionA myRecursiveActionA2 = new MyRecursiveActionA();
        MyRecursiveActionA myRecursiveActionA3 = new MyRecursiveActionA();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(myRecursiveActionA1);
        forkJoinPool.submit(myRecursiveActionA2);
        forkJoinPool.submit(myRecursiveActionA3);
        System.out.println("并行数 = " + forkJoinPool.getParallelism() + " ,线程池大小 = " + forkJoinPool.getPoolSize());
        forkJoinPool.shutdown();
        ;
        do {
        } while (!forkJoinPool.isTerminated());
        System.out.println("main end");
    }
}
