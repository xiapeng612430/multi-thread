package executors.threadPoolExecutor_2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:26 下午
 */
public class Test4 {

    public static void main(String[] args) throws InterruptedException {

        MyRunnableA myRunnableA = new MyRunnableA();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, 10, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(myRunnableA);
        threadPoolExecutor.execute(myRunnableA);
        threadPoolExecutor.execute(myRunnableA);
        threadPoolExecutor.execute(myRunnableA);

        Thread.sleep(1000);
        threadPoolExecutor.shutdown();
        threadPoolExecutor.execute(myRunnableA);

        System.out.println("main end! ");
    }
}
