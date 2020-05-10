package executors.threadPoolExecutor_remove;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:32 下午
 */
public class Test2 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " begin");
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + "   end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " begin");
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + "   end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 100, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(runnable1);
        threadPoolExecutor.execute(runnable2);

        Thread.sleep(1000);

        threadPoolExecutor.remove(runnable2);

        System.out.println("任务2没在运行可以删除！");
    }
}
