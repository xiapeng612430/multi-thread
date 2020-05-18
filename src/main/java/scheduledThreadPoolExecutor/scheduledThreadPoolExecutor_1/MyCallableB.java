package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_1;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:03 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        System.out.println("MyCallableB   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        return "BBB";
    }
}
