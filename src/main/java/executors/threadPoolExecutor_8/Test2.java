package executors.threadPoolExecutor_8;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:41 上午
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 5, 5, TimeUnit.SECONDS, new SynchronousQueue<>());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        System.out.println(threadPoolExecutor.allowsCoreThreadTimeOut());

        for (int i = 0; i < 4; i++) {
            MyRunnable myRunnable = new MyRunnable();
            threadPoolExecutor.execute(myRunnable);
        }

        Thread.sleep(8000);
        System.out.println(threadPoolExecutor.getPoolSize());
    }
}
