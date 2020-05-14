package future_callable.future_last;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:57 下午
 */
public class MyCallable implements Callable<String> {

    private String username;
    private Integer sleepValue;

    public MyCallable(String username, Integer sleepValue) {
        this.username = username;
        this.sleepValue = sleepValue;
    }

    @Override
    public String call() throws Exception {
        System.out.println(username);
        Thread.sleep(sleepValue);
        return "return " + username;
    }
}
