package executorService.executorService_invokeAny_5;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:13 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin " + System.currentTimeMillis());
        for (int i = 0; i < 193456999; i++) {
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            String newString = new String();
            //System.out.println("MyCallableA running " + (i + 1));
        }
        System.out.println("MyCallableA   end " + System.currentTimeMillis());

        return "AAA";
    }
}
