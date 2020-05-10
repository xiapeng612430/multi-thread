package future_callable.future_callable_4;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:29 下午
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "my age is 100";
    }
}
