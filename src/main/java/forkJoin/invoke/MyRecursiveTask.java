package forkJoin.invoke;

import java.util.concurrent.RecursiveTask;

/**
 * @date 2020/05/26
 * @time 17:52
 */
public class MyRecursiveTask extends RecursiveTask<String> {

    @Override
    protected String compute() {
        return "result";
    }
}
