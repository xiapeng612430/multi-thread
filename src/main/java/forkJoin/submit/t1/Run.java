package forkJoin.submit.t1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:22 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask = new MyRecursiveTask();
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<String> forkJoinTask = forkJoinPool.submit(myRecursiveTask);
            System.out.println("begin " + System.currentTimeMillis());
            System.out.println(forkJoinTask.get());
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
