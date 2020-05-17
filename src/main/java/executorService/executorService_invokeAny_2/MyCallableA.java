package executorService.executorService_invokeAny_2;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 12:16 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA " + Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        for (int i = 0; i < 12345; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();

            System.out.println("MyCallableA running " + (i + 1));
        }
        System.out.println("MyCallableA " + Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        return "Ruturn A";
    }
}
