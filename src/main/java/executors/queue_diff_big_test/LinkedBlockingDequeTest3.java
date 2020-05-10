package executors.queue_diff_big_test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 11:40 上午
 */
public class LinkedBlockingDequeTest3 {

    public static void main(String[] args) {
        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<>();
        // max 值被忽略
        // 队列容量默认为Integer.MAX_VALUE
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
