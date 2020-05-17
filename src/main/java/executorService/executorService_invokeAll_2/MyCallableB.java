package executorService.executorService_invokeAll_2;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 8:54 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB begin " + System.currentTimeMillis());
        for (int i = 0; i < 223456; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableB running " + (i + 1));
        }
        System.out.println("MyCallableB   end " + System.currentTimeMillis());
        if (true) {
            System.out.println("B ....... exception");
            throw new Exception("BException");
        }
        return "BBB";
    }
}
