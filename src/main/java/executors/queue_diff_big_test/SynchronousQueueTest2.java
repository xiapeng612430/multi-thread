package executors.queue_diff_big_test;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 12:08 下午
 */
public class SynchronousQueueTest2 {

    public static void main(String[] args) {
        SynchronousQueue synchronousQueue = new SynchronousQueue<>();
        System.out.println(synchronousQueue.size());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, synchronousQueue);

        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());

        System.out.println(threadPoolExecutor.getPoolSize() + " " + synchronousQueue.size());
    }
}
