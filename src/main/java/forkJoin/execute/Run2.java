package forkJoin.execute;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:11 下午
 */
public class Run2 {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Name : " + Thread.currentThread().getName());
            }
        });
    }
}
