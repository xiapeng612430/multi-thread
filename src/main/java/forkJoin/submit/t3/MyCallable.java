package forkJoin.submit.t3;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:31 下午
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "result";
    }
}
