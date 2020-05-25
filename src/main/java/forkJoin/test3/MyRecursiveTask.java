package forkJoin.test3;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/25
 * @time 18:02
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        System.out.println("compute time = " + System.currentTimeMillis());
        return 100;
    }
}
