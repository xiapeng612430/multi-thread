package executors.threadPoolExecutor_5;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:28 下午
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableA myRunnableA = new MyRunnableA();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(myRunnableA);

        threadPoolExecutor.shutdown();

        System.out.println("main begin " + System.currentTimeMillis());
        System.out.println(threadPoolExecutor.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("main   end " + System.currentTimeMillis());

    }
}
