package executorService.executorService_invokeAll_5;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 10:42 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB begin " + System.currentTimeMillis());
        for (int i = 0; i < 12345; i++) {
            Math.random();
            Math.random();
            System.out.println("MyCallableB running " + (i + 1));
        }
        Thread.sleep(2000);
        System.out.println("MyCallableB   end " + System.currentTimeMillis());
        return "BBB";
    }
}
