package executorService.executorService_invokeAny_3;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 12:54 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA " + Thread.currentThread().getName() + " begin " + System.currentTimeMillis());

        for (int i = 0; i < 123456; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();

            System.out.println("MyCallableA running " + (i + 1));
        }
        if (true) {
            System.out.println("xxxxxxxx interrupted .... ");
            throw new NullPointerException();
        }
        System.out.println("MyCallableA " + Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        return "AAA";
    }
}
