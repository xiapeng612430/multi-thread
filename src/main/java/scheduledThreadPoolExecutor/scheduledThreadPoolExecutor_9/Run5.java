package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/23 11:14 上午
 */
public class Run5 {

    public static void main(String[] args) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
            Runnable runnable = new MyRunnable("A");
            ScheduledFuture<?> future = scheduledThreadPoolExecutor.schedule(runnable, 0, TimeUnit.SECONDS);
            Thread.sleep(3000);
            System.out.println(future.cancel(false));
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
