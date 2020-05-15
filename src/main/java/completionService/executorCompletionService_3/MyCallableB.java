package completionService.executorCompletionService_3;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:32 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        System.out.println("MyCallableB .. " + System.currentTimeMillis());

        return "B";
    }
}
