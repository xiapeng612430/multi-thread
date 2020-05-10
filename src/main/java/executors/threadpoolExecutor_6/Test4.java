package executors.threadpoolExecutor_6;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:18 上午
 */
public class Test4 {

    public static void main(String[] args) {
        MyRunnableB myRunnableB = new MyRunnableB();
        MyThreadFactoryB myThreadFactoryB = new MyThreadFactoryB();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        threadPoolExecutor.setThreadFactory(myThreadFactoryB);
        threadPoolExecutor.execute(myRunnableB);
    }
}
