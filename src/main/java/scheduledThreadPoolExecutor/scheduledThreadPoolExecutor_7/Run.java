package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_7;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/20 7:47 上午
 */
public class Run {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);

        Runnable runnable1 = new MyRunnable("A");
        Runnable runnable2 = new MyRunnable("B");

        scheduledThreadPoolExecutor.schedule(runnable1, 3, TimeUnit.SECONDS);

        scheduledThreadPoolExecutor.shutdown();
        System.out.println("shutdown....");
    }
}
