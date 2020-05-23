package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_9;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/23 10:47 上午
 */
public class Run {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);

        Runnable runnable1 = new MyRunnable("A");
        ScheduledFuture future = scheduledThreadPoolExecutor.schedule(runnable1, 1, TimeUnit.SECONDS);
        System.out.println(future.cancel(true));

        System.out.println("===================");

        BlockingQueue<Runnable> queue = scheduledThreadPoolExecutor.getQueue();
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Runnable runnable = iterator.next();
            System.out.println("in queue -> " + runnable);
        }

        System.out.println("main end....");
    }
}
