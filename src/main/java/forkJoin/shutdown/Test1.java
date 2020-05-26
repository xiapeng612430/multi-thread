package forkJoin.shutdown;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 09:47
 */
public class Test1 {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println("main end");
    }
}
