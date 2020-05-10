package executors.threadPoolExecutor_remove;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:35 下午
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin A " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                    Thread.sleep(5000);
                    System.out.println("  end A " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin B " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                    Thread.sleep(5000);
                    System.out.println("  end B " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.submit(runnable1);
        threadPoolExecutor.submit(runnable2);

        Thread.sleep(1000);
        threadPoolExecutor.remove(runnable2);
        System.out.println("main end!");
    }
}
