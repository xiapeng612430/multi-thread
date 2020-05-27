package forkJoin.exception;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/27
 * @time 16:18
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        try {
            Thread.sleep(1000);
            Integer.parseInt("A");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw e;
        }
        return 1;
    }
}
