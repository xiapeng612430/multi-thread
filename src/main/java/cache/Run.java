package cache;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @date 2021/01/15
 * @time 18:07
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(300);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ICache<String, Integer> cache = new ICache<>(new ExpensiveFunction());
        for (int i = 0; i < 300; i++) {
            executorService.submit(() -> {
                // 所有线程同一时刻执行
                Integer result;
                try {
                    countDownLatch.await();
                    System.out.println(System.currentTimeMillis() / 1000);
                    result = cache.compute("1");
                } catch (Exception e) {
                    e.printStackTrace();
                    result = null;
                }
                System.out.println("result: " + result);

            });
        }
        try {
            TimeUnit.SECONDS.sleep(5);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
