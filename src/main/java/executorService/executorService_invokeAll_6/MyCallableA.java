package executorService.executorService_invokeAll_6;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 10:42 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin " + System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            Math.random();
            Math.random();
            System.out.println("MyCallableA running " + (i + 1));
        }
        Thread.sleep(2000);
        System.out.println("MyCallableA   end " + System.currentTimeMillis());
        return "AAA";
    }
}
