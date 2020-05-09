package executors.newFixedThreadPoolFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 7:40 下午
 */
public class Run {

    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newFixedThreadPool(2, myThreadFactory);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("begin 我在运行 " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println("  end 我在运行 " + System.currentTimeMillis() + " " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        executorService.execute(runnable);
        executorService.execute(runnable);
        executorService.execute(runnable);

    }
}
