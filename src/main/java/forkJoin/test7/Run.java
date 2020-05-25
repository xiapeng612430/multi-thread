package forkJoin.test7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 10:52 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask = new MyRecursiveTask(1, 10);
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<Integer> forkJoinTask = forkJoinPool.submit(myRecursiveTask);
            System.out.println("sum: " + forkJoinTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
