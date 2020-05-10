package executors.threadpoolExecutor_6;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 9:58 上午
 */
public class MyThreadFactoryA implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("my thread " + new Date());
        return thread;
    }
}
