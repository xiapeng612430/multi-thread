package executors.queue_diff_big_test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 11:36 上午
 */
public class LinkedBlockingDequeTest1 {

    public static void main(String[] args) {
        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<>(2);

        System.out.println(linkedBlockingDeque.size());
// max 值被参考
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linkedBlockingDeque);

        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());
        threadPoolExecutor.execute(new MyRunnable());

        System.out.println(threadPoolExecutor.getPoolSize() + " " + linkedBlockingDeque.size());
    }
}
