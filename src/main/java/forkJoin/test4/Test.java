package forkJoin.test4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/25
 * @time 18:24
 */
public class Test {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> taskA = forkJoinPool.submit(new MyRecursiveTaskA());
        ForkJoinTask<Integer> taskB = forkJoinPool.submit(new MyRecursiveTaskB());
        System.out.println(taskB.join() + " B: " + System.currentTimeMillis());
        System.out.println(taskA.join() + " A: " + System.currentTimeMillis());

    }
}
