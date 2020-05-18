package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_1;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:03 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        Thread.sleep(3000);
        System.out.println("MyCallableA   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        return "AAA";
    }
}
