package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/23 11:10 上午
 */
public class Run4 {

    public static void main(String[] args) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecuto = new ScheduledThreadPoolExecutor(10);
            Runnable myRunnable = new MyRunnable("A");
            ScheduledFuture future = scheduledThreadPoolExecuto.schedule(myRunnable, 0, TimeUnit.SECONDS);
            Thread.sleep(3000);
            System.out.println("canceled: " + future.cancel(true));
            System.out.println("main end..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
