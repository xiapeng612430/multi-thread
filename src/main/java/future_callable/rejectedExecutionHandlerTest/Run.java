package future_callable.rejectedExecutionHandlerTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:22 下午
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        threadPoolExecutor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());

        threadPoolExecutor.submit(new MyRunnable("A"));
        threadPoolExecutor.submit(new MyRunnable("B"));
        threadPoolExecutor.submit(new MyRunnable("C"));

        threadPoolExecutor.shutdown();

        threadPoolExecutor.submit(new MyRunnable("D"));
    }
}
