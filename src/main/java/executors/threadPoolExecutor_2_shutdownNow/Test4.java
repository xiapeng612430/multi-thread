package executors.threadPoolExecutor_2_shutdownNow;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:00 下午
 */
public class Test4 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableC t1 = new MyRunnableC("A");
        MyRunnableC t2 = new MyRunnableC("B");
        MyRunnableC t3 = new MyRunnableC("C");
        MyRunnableC t4 = new MyRunnableC("D");

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 30, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(t1);
        threadPoolExecutor.execute(t2);
        threadPoolExecutor.execute(t3);
        threadPoolExecutor.execute(t4);

        Thread.sleep(1000);
        List<Runnable> runnables = threadPoolExecutor.shutdownNow();

        for (int i = 0; i < runnables.size(); i++) {
            MyRunnableC runnable = (MyRunnableC) runnables.get(i);
            System.out.println(runnable.getUsername() + " 任务被取消");
        }

        System.out.println("main end! ");
    }
}
