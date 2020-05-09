package executors.threadPoolExecutor_3;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:09 下午
 */
public class Run {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin: " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                    System.out.println("  end: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, Integer.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(runnable);

        System.out.println("A: " + threadPoolExecutor.isShutdown());
        threadPoolExecutor.shutdown();
        System.out.println("B: " + threadPoolExecutor.isShutdown());

    }
}
