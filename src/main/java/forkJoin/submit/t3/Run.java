package forkJoin.submit.t3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:32 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable();
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            System.out.println("begin " + System.currentTimeMillis());
            ForkJoinTask<String> forkJoinTask = forkJoinPool.submit(myCallable);
            System.out.println(forkJoinTask.get());
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
