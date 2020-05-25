package forkJoin.join_get;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @date 2020/05/25
 * @time 18:13
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyRecursiveTask myRecursiveTask = new MyRecursiveTask();
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<Integer> task = forkJoinPool.submit(myRecursiveTask);
            System.out.println(task.get());

            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String s = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
            }
        } catch (InterruptedException e) {
            System.out.println("catch interrupted exception");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("catch execution exception");
            e.printStackTrace();
        }
    }
}
