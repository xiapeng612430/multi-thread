package future_callable.execute_submit_diff;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:41 下午
 */
public class Test4 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.setThreadFactory(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {

                Thread thread = new Thread(r);
                thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("execute()方法自定义处理异常");
                        e.printStackTrace();
                    }
                });
                return thread;
            }
        });

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                Integer.parseInt("a");
            }
        });


    }
}
