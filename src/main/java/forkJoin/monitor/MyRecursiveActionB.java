package forkJoin.monitor;

import java.util.concurrent.RecursiveAction;

/**
 * @date 2020/05/27
 * @time 16:09
 */
public class MyRecursiveActionB extends RecursiveAction {

    int i = 0;

    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        while (i < 10000) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + "  end " + System.currentTimeMillis());
    }
}
