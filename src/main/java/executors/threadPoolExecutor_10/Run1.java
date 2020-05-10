package executors.threadPoolExecutor_10;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 11:16 上午
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(" thread " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.getCompletedTaskCount());

    }
}
