package forkJoin.execute.t3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:17 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyRecursiveTask task = new MyRecursiveTask();
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            forkJoinPool.execute(task);

            System.out.println(System.currentTimeMillis());
            System.out.println(task.get());
            System.out.println(System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
