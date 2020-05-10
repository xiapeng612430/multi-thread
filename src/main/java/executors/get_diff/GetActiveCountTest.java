package executors.get_diff;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:45 下午
 */
public class GetActiveCountTest {

    public static void main(String[] args) throws InterruptedException {
        MyThreadA myThreadA = new MyThreadA();

        SynchronousQueue synchronousQueue = new SynchronousQueue<Runnable>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, synchronousQueue);

        threadPoolExecutor.execute(myThreadA);
        threadPoolExecutor.execute(myThreadA);

        threadPoolExecutor.execute(myThreadA);

        System.out.println(threadPoolExecutor.getActiveCount() + " " + threadPoolExecutor.getPoolSize());
        Thread.sleep(7000);
        System.out.println(threadPoolExecutor.getActiveCount() + " " + threadPoolExecutor.getPoolSize());

    }
}
