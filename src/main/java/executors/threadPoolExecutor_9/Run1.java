package executors.threadPoolExecutor_9;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:57 上午
 */
public class Run1 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin > " + System.currentTimeMillis());
                    Thread.sleep(4000);
                    System.out.println("  end > " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        System.out.println("线程池中的线程数A：" + threadPoolExecutor.getPoolSize());
        System.out.println("Z1 = " + threadPoolExecutor.prestartCoreThread());

        System.out.println("线程池中的线程数B：" + threadPoolExecutor.getPoolSize());
        System.out.println("Z2 = " + threadPoolExecutor.prestartCoreThread());

        System.out.println("线程池中的线程数C：" + threadPoolExecutor.getPoolSize());
        System.out.println("Z3 = " + threadPoolExecutor.prestartCoreThread());

        System.out.println("Z4 = " + threadPoolExecutor.prestartCoreThread());
        System.out.println("Z5 = " + threadPoolExecutor.prestartCoreThread());
        System.out.println("Z6 = " + threadPoolExecutor.prestartCoreThread());

        System.out.println("线程池中的线程数D：" + threadPoolExecutor.getPoolSize());
    }
}
