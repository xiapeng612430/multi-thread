package forkJoin.monitor;

import java.util.concurrent.ForkJoinPool;

/**
 * @date 2020/05/27
 * @time 16:12
 */
public class Run5 {

    public static void main(String[] args) throws InterruptedException {
        MyRecursiveActionB myRecursiveActionB = new MyRecursiveActionB();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println("任务池是否是静止未执行任务的状态 " + forkJoinPool.isQuiescent());
        forkJoinPool.submit(myRecursiveActionB);
        Thread.sleep(1000);
        System.out.println("任务池是否是静止未执行任务的状态 " + forkJoinPool.isQuiescent());

    }
}
