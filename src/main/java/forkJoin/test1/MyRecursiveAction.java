package forkJoin.test1;

import java.util.concurrent.RecursiveAction;

/**
 * @date 2020/05/25
 * @time 15:20
 */
public class MyRecursiveAction extends RecursiveAction {

    @Override
    protected void compute() {
        System.out.println("compute run ...");
    }
}
