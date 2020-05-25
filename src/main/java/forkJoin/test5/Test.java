package forkJoin.test5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/25
 * @time 18:55
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(1, 20);
        ForkJoinTask<String> forkJoinTask = forkJoinPool.submit(myRecursiveTask);
        System.out.println(forkJoinTask.join());
        Thread.sleep(5000);
    }
}
