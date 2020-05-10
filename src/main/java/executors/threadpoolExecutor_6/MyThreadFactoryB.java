package executors.threadpoolExecutor_6;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:16 上午
 */
public class MyThreadFactoryB implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("my new Thread " + new Date());
        thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("自定义处理异常启用：" + t.getName() + " " + e.getMessage());
            }
        });
        return thread;
    }
}
