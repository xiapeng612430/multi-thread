package forkJoin.execute;

import java.util.concurrent.RecursiveAction;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:00 下午
 */
public class MyRecursiveAction extends RecursiveAction {

    @Override
    protected void compute() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }
}
