package executorService.executorService_invokeAll_2;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 8:54 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableA running " + (i + 1));
        }
        System.out.println("MyCallableA   end " + System.currentTimeMillis());

        return "AAA";
    }
}
