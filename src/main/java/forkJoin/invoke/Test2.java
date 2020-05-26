package forkJoin.invoke;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/26
 * @time 17:56
 */
public class Test2 {

    public static void main(String[] args) {
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        String resultString = forkJoinPool.invoke(myRecursiveTask);
        System.out.println(resultString);
    }
}
