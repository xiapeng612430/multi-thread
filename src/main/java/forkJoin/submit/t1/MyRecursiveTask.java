package forkJoin.submit.t1;

import java.util.concurrent.RecursiveTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:21 下午
 */
public class MyRecursiveTask extends RecursiveTask<String> {

    @Override
    protected String compute() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "result";
    }
}
