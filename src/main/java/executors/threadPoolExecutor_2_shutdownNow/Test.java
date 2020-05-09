package executors.threadPoolExecutor_2_shutdownNow;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:46 下午
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableA myRunnableA = new MyRunnableA();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(myRunnableA);
        threadPoolExecutor.execute(myRunnableA);
        threadPoolExecutor.execute(myRunnableA);
        threadPoolExecutor.execute(myRunnableA);

        Thread.sleep(1000);
        threadPoolExecutor.shutdownNow();

    }
}
