package forkJoin.test6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 10:28 下午
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask = new MyRecursiveTask(1, 10);
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<Integer> sum = forkJoinPool.submit(myRecursiveTask);
            System.out.println("sum : " + myRecursiveTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
