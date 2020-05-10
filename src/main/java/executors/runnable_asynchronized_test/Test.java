package executors.runnable_asynchronized_test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 7:25 下午
 */
public class Test {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        for (int i = 0; i < 50; i++) {
            MyRunnable myRunnable = new MyRunnable("user" + (i + 1));
            threadPoolExecutor.execute(myRunnable);
        }

    }
}
