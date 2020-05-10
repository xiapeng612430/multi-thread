package executors.policy_discardOldestPolicy;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 3:39 下午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(2);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, arrayBlockingQueue, new DiscardOldestPolicy());

        for (int i = 0; i < 5; i++) {
            MyRunnable myRunnable = new MyRunnable("Runnable" + (i + 1));

            threadPoolExecutor.execute(myRunnable);
        }

        Thread.sleep(50);

        Iterator iterator = arrayBlockingQueue.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(((MyRunnable) object).getUsername());
        }

        threadPoolExecutor.execute(new MyRunnable("Runnable6"));
        threadPoolExecutor.execute(new MyRunnable("Runnable7"));

        iterator = arrayBlockingQueue.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(((MyRunnable) object).getUsername());
        }
    }
}
