package executors.threadPoolExecutor_remove;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:28 下午
 */
public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
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

        threadPoolExecutor.execute(runnable);

        Thread.sleep(1000);

        threadPoolExecutor.remove(runnable);

        System.out.println("任务正在进行不能删除");
    }
}
