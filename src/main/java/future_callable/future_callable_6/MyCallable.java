package future_callable.future_callable_6;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:00 下午
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        System.out.println("sleep 10s ...");
        return "any string";
    }
}
