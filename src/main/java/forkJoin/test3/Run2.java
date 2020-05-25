package forkJoin.test3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/25
 * @time 18:08
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask = new MyRecursiveTask();
            System.out.println(myRecursiveTask.hashCode());
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<Integer> task = forkJoinPool.submit(myRecursiveTask);
            System.out.println(task.hashCode() + " " + task.join());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
