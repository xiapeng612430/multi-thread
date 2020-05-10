package executors.threadPoolExecutor_7;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:33 上午
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(((MyRunnableA) r).getUsername() + "被拒绝执行!");
    }
}
