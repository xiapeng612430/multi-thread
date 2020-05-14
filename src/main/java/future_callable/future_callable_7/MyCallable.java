package future_callable.future_callable_7;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:12 下午
 */
public class MyCallable implements Callable<String> {

    private String number;

    public MyCallable(String number) {
        super();
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        Integer.parseInt("A");
        return "number " + number;
    }
}
