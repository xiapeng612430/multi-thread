package executors.threadpoolExecutor_6;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:14 上午
 */
public class Test3 {

    public static void main(String[] args) {
        MyRunnableB myRunnableB = new MyRunnableB();
        MyThreadFactoryA myThreadFactoryA = new MyThreadFactoryA();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        threadPoolExecutor.setThreadFactory(myThreadFactoryA);
        threadPoolExecutor.execute(myRunnableB);
    }
}
