package future_callable.future_callable_5;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:41 下午
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int i = 0;
        while (i == 0) {
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException();
            }
            System.out.println("正在运行！");
        }
        return "我的年纪是100";
    }
}
