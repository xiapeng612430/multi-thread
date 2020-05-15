package completionService.executorCompletionService_errorHandle;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:57 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallableA begin " + System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println("MyCallableA   end " + System.currentTimeMillis());
        return null;
    }
}
