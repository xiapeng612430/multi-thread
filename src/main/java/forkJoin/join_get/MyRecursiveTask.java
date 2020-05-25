package forkJoin.join_get;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/25
 * @time 18:11
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName() + " run compute method");
        String nullString = null;
        nullString.toString();
        return 100;
    }
}
