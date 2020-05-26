package forkJoin.invoke;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 17:53
 */
public class Test {

    public static void main(String[] args) {
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(myRecursiveAction);
    }
}
