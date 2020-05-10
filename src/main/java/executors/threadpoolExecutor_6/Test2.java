package executors.threadpoolExecutor_6;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:02 上午
 */
public class Test2 {

    public static void main(String[] args) {
        MyRunnableA myRunnableA = new MyRunnableA();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 99999, 99999L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.setThreadFactory(new MyThreadFactoryA());

        threadPoolExecutor.execute(myRunnableA);
    }
}
