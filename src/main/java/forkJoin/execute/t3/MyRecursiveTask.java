package forkJoin.execute.t3;

import java.util.concurrent.RecursiveTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:15 下午
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
