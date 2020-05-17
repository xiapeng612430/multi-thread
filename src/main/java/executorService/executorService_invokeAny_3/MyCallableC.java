package executorService.executorService_invokeAny_3;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 5:50 下午
 */
public class MyCallableC implements Callable<String> {

    @Override
    public String call() throws Exception {
        try {
            System.out.println("MyCallableC " + Thread.currentThread().getName() + " begin " + System.currentTimeMillis());

            for (int i = 0; i < 123456; i++) {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();

                System.out.println("MyCallableC running " + (i + 1));
            }
            if (true) {
                System.out.println("xxxxxxxx interrupted .... ");
                throw new NullPointerException();
            }
            System.out.println("MyCallableC " + Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("catch exception " + e.getMessage());
            throw e;
        }
        return "CCC";
    }
}
