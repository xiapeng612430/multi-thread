package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_6;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 11:33 下午
 */
public class Run {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
        Runnable runnable1 = new MyRunnableA("A");
        Runnable runnable2 = new MyRunnableA("B");
        Runnable runnable3 = new MyRunnableA("C");
        Runnable runnable4 = new MyRunnableA("D");
        Runnable runnable5 = new MyRunnableA("E");

        System.out.println(runnable1.hashCode());
        System.out.println(runnable2.hashCode());
        System.out.println(runnable3.hashCode());
        System.out.println(runnable4.hashCode());
        System.out.println(runnable5.hashCode());

        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable1, 10, 2, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable2, 10, 2, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable3, 10, 2, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable4, 10, 2, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable5, 10, 2, TimeUnit.SECONDS);

        System.out.println("//////////////////////");

        BlockingQueue<Runnable> queue = scheduledThreadPoolExecutor.getQueue();

        Iterator<Runnable> iterator = queue.iterator();

        while (iterator.hasNext()) {
            Runnable runnable = (Runnable) iterator.next();
            System.out.println("in queue : " + runnable);
        }
    }
}
