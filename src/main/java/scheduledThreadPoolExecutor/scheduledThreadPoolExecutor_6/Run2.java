package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_6;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/20 7:27 上午
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            ScheduledThreadPoolExecutor scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
            Runnable runnable1 = new MyRunnableA("A");
            Runnable runnable2 = new MyRunnableA("B");

            ScheduledFuture scheduledFuture1 = scheduledExecutorService.scheduleAtFixedRate(runnable1, 0, 2, TimeUnit.SECONDS);
            Thread.sleep(1000);
            ScheduledFuture scheduledFuture2 = scheduledExecutorService.scheduleAtFixedRate(runnable2, 10, 2, TimeUnit.SECONDS);

            Thread.sleep(5000);
            System.out.println(scheduledExecutorService.remove((Runnable) scheduledFuture2));
            System.out.println("-------------------");

            BlockingQueue<Runnable> queue = scheduledExecutorService.getQueue();

            Iterator<Runnable> iterator = queue.iterator();

            while (iterator.hasNext()) {
                Runnable next = iterator.next();
                System.out.println(">>>>>> " + next);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
