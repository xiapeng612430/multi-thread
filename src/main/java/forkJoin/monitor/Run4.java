package forkJoin.monitor;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/27
 * @time 14:58
 */
public class Run4 {

    public static void main(String[] args) {
        MyRecursiveTask2 myRecursiveTask2 = new MyRecursiveTask2(1, 900000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(myRecursiveTask2);
        do {
            System.out.print("并行数 = " + forkJoinPool.getParallelism());
            System.out.print("线程数 = " + forkJoinPool.getPoolSize());
            System.out.print("活动的线程数 = " + forkJoinPool.getActiveThreadCount());
            System.out.print("任务总数 = " + forkJoinPool.getQueuedTaskCount());
            System.out.print("偷窃的任务数 = " + forkJoinPool.getStealCount());
            System.out.println("正在运行的线程数 = " + forkJoinPool.getRunningThreadCount());
        } while (!myRecursiveTask2.isDone());
    }
}
