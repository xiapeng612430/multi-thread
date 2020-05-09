package executors.threadPoolExecutor_4;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:22 下午
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);

        System.out.println(threadPoolExecutor.isTerminating() + " " + threadPoolExecutor.isTerminated());

        threadPoolExecutor.shutdown();;

        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.isTerminating() + " " + threadPoolExecutor.isTerminated());

        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.isTerminating() + " " + threadPoolExecutor.isTerminated());

        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.isTerminating() + " " + threadPoolExecutor.isTerminated());

        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.isTerminating() + " " + threadPoolExecutor.isTerminated());

        Thread.sleep(1000);
        System.out.println(threadPoolExecutor.isTerminating() + " " + threadPoolExecutor.isTerminated());


    }
}
