package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author xianpeng.xia
 * on 2021/1/6 下午11:53
 */
public class ShutDown {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ShutDownTask());
        }

        Thread.sleep(1500);
        // 立刻停止线程池,并返回未执行task
        System.out.println("shutdownNow : " + executorService.shutdownNow());
        // 时间范围内线程池是否停止,阻塞
        System.out.println("awaitTermination : " + executorService.awaitTermination(3, TimeUnit.SECONDS));
        // 是否关闭线程池
        System.out.println("isShutdown : " + executorService.isShutdown());
        // 请求关闭线程池
        executorService.shutdown();
        System.out.println("isShutdown : " + executorService.isShutdown());
        // 是否完全停止
        System.out.println("isTerminated : " + executorService.isTerminated());

        Thread.sleep(10 * 1000);
        System.out.println("isTerminated : " + executorService.isTerminated());

    }
}

class ShutDownTask implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
