package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_8;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/20 8:04 上午
 */
public class Run2 {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
        Runnable runnable = new MyRunnable("A");

        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable, 1, 2, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
        scheduledThreadPoolExecutor.shutdown();
        System.out.println("shutdown");
    }
}
