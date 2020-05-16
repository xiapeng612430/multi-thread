package executorService.executorService_invokeAny_1;

import java.util.concurrent.Callable;

/**
 * @date 2020/05/16
 * @time 15:36
 */
public class MyCallableB1 implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.println("MyCallableB begin : " + System.currentTimeMillis());
        for (int i = 0; i < 223456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableB " + (i + 1));
        }

        System.out.println("MyCallableB  end : " + System.currentTimeMillis());
        return "return MyCallableB";
    }
}
