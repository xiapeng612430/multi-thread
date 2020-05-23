package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_9;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/23 11:05 上午
 */
public class Run3 {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledExecutorService = new ScheduledThreadPoolExecutor(10);
        Runnable runnable = new MyRunnable("A");
        ScheduledFuture future = scheduledExecutorService.schedule(runnable, 1, TimeUnit.SECONDS);
        scheduledExecutorService.setRemoveOnCancelPolicy(true);
        System.out.println("canceled : " + future.cancel(true));
        System.out.println("----------");
        BlockingQueue<Runnable> queue = scheduledExecutorService.getQueue();
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Runnable runnablea = iterator.next();
            System.out.println("in quene: " + runnablea);
        }
        System.out.println("main end");
    }
}
