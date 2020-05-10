package executors.queue_diff_big_test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 12:01 下午
 */
public class ArrayBlockingQueueTest2 {

    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(2);
        System.out.println(arrayBlockingQueue.size());

        // max值被参考
        // 队列容量不够，有一个任务异常
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, arrayBlockingQueue);

        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());

        threadPoolExecutor.execute(new MyRunnable());

        System.out.println(threadPoolExecutor.getPoolSize() + " " + arrayBlockingQueue.size());
    }
}
