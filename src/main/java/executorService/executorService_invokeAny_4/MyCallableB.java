package executorService.executorService_invokeAny_4;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:00 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB begin " + System.currentTimeMillis());
        for (int i = 0; i < 1234; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableB running " + (i + 1));
        }
        System.out.println("MyCallableB   end " + System.currentTimeMillis());
        if (true) {
            System.out.println(">>>>>>>>>> B exception");
            throw new NullPointerException();
        }
        return "BBB";
    }
}
