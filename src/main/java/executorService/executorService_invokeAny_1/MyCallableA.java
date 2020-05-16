package executorService.executorService_invokeAny_1;

import java.util.concurrent.Callable;

/**
 * @date 2020/05/16
 * @time 15:36
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {

        System.out.println("MyCallableA begin : " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableA " + (i + 1));
        }
        System.out.println("MyCallableA  end : " + System.currentTimeMillis());
        return "return MyCallableA";
    }
}
