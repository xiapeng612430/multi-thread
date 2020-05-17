package executorService.executorService_invokeAll_1;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:57 下午
 */
public class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        Thread.sleep(8000);
        System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        return "BBB";
    }
}
