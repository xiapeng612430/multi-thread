package completionService.executorCompletionService_errorHandle;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:57 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableB begin " + System.currentTimeMillis());
        Thread.sleep(5000);

        if (true) {
            throw new Exception(" throws exception");
        }
        System.out.println("MyCallableB   end " + System.currentTimeMillis());
        return null;
    }
}
