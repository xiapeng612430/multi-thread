package forkJoin.test3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/25
 * @time 18:04
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask = new MyRecursiveTask();
            System.out.println(myRecursiveTask.hashCode());
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<Integer> task = forkJoinPool.submit(myRecursiveTask);
            System.out.println(task.hashCode() + " " + task.get());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
