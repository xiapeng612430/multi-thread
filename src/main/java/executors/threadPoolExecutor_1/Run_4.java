package executors.threadPoolExecutor_1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 9:34 下午
 */
public class Run_4 {

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

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        Thread.sleep(300);
        System.out.println("A: " + threadPoolExecutor.getCorePoolSize());
        System.out.println("A: " + threadPoolExecutor.getPoolSize());
        System.out.println("A: " + threadPoolExecutor.getQueue().size());

        Thread.sleep(10000);
        System.out.println("B: " + threadPoolExecutor.getCorePoolSize());
        System.out.println("B: " + threadPoolExecutor.getPoolSize());
        System.out.println("B: " + threadPoolExecutor.getQueue().size());

    }
}
