package executors.queue_diff_big_test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 11:40 上午
 */
public class LinkedBlockingDequeTest2 {

    public static void main(String[] args) {
        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<>(2);
        // max 值被参考
        // 但队列容量不够，有一个任务异常
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linkedBlockingDeque);

        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());

        System.out.println(threadPoolExecutor.getPoolSize() + " " + linkedBlockingDeque.size());
    }
}
