package executorService.executorService_invokeAny_5;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:13 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        try {
            System.out.println("MyCallableB begin " + System.currentTimeMillis());
            for (int i = 0; i < 19345699; i++) {
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
                System.out.println("MyCallableB running " + (i + 1));
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("........ MyCallableA is interrupted ");
                    throw new NullPointerException();
                }
            }
            System.out.println("MyCallableB   end " + System.currentTimeMillis());
        } catch (NullPointerException e) {
            System.out.println("catch exception .... " + e.getMessage());
            e.printStackTrace();
        }
        return "BBB";
    }
}
