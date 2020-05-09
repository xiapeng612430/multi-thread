package executors.threadPoolExecutor_2_shutdownNow;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:51 下午
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableB myRunnableB = new MyRunnableB();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(myRunnableB);
        threadPoolExecutor.execute(myRunnableB);
        threadPoolExecutor.execute(myRunnableB);
        threadPoolExecutor.execute(myRunnableB);

        Thread.sleep(1000);
        threadPoolExecutor.shutdownNow();
        threadPoolExecutor.execute(myRunnableB);

        System.out.println("main end! ");
    }
}
