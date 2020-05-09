package executors.threadPoolExecutor_1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 8:30 下午
 */
public class Run_2_2 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " run ! " + System.currentTimeMillis());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor threaPolExecutor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new SynchronousQueue<>());

        threaPolExecutor.execute(runnable);
        threaPolExecutor.execute(runnable);
        threaPolExecutor.execute(runnable);
        threaPolExecutor.execute(runnable);
        threaPolExecutor.execute(runnable);
        threaPolExecutor.execute(runnable);
        threaPolExecutor.execute(runnable);

        Thread.sleep(300);

        System.out.println("A " + threaPolExecutor.getCorePoolSize());
        System.out.println("A " + threaPolExecutor.getPoolSize());
        System.out.println("A " + threaPolExecutor.getQueue().size());

        Thread.sleep(10000);
        System.out.println("B " + threaPolExecutor.getCorePoolSize());
        System.out.println("B " + threaPolExecutor.getPoolSize());
        System.out.println("B " + threaPolExecutor.getQueue().size());
    }
}
