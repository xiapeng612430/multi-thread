package forkJoin.monitor;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/27
 * @time 14:38
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        MyRecursiveActionA myRecursiveActionA = null;
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        for (int i = 0; i < 50; i++) {
            myRecursiveActionA = new MyRecursiveActionA();
            forkJoinPool.submit(myRecursiveActionA);
        }
        Thread.sleep(50);
        System.out.println("并行数 = " + forkJoinPool.getParallelism());
        System.out.println("线程池大小 = " + forkJoinPool.getPoolSize());
        System.out.println("提交但未执行的任务数" + forkJoinPool.getQueuedSubmissionCount());
        System.out.println("是否有提交但未执行的任务" + forkJoinPool.hasQueuedSubmissions());
        do {
        } while (!myRecursiveActionA.isDone());
    }
}
