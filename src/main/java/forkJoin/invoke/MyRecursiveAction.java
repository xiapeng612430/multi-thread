package forkJoin.invoke;

import java.util.concurrent.RecursiveAction;

/**
 * @date 2020/05/26
 * @time 17:46
 */
public class MyRecursiveAction extends RecursiveAction {

    @Override
    protected void compute() {
        System.out.println("Thread Name " + Thread.currentThread().getName());
    }
}
