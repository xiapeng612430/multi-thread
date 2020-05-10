package executors.threadPoolExecutor_after_before;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:19 下午
 */
public class Run {

    public static void main(String[] args) {
        MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor(2, 2, Integer.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());

        myThreadPoolExecutor.execute(new MyRunnable("A"));
        myThreadPoolExecutor.execute(new MyRunnable("B"));
        myThreadPoolExecutor.execute(new MyRunnable("C"));
        myThreadPoolExecutor.execute(new MyRunnable("D"));
    }
}
