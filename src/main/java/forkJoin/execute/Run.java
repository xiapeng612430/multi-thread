package forkJoin.execute;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:02 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            forkJoinPool.execute(new MyRecursiveAction());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
