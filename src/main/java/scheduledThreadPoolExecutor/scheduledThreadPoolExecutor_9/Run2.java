package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_9;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/23 10:54 上午
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
            Runnable runnable = new MyRunnable("A");
            ScheduledFuture future = scheduledThreadPoolExecutor.schedule(runnable, 0, TimeUnit.SECONDS);
            Thread.sleep(2000);

            BlockingQueue<Runnable> queue = scheduledThreadPoolExecutor.getQueue();
            System.out.println("------------ size " + queue.size());

            System.out.println("canceled .. " + future.cancel(true));
            queue = scheduledThreadPoolExecutor.getQueue();
            System.out.println("------------ size " + queue.size());
            System.out.println("main end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
