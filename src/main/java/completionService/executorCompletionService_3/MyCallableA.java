package completionService.executorCompletionService_3;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:32 下午
 */
public class MyCallableA implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println("MyCallableA .. " + System.currentTimeMillis());

        return "A";
    }
}
