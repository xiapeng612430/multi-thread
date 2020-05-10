package future_callable.future_callable_1;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 9:14 下午
 */
public class MyCallable implements Callable<String> {

    private int age;

    public MyCallable(int age) {
        super();
        this.age = age;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(8000);
        return "返回值 年龄是: " + age;
    }
}
