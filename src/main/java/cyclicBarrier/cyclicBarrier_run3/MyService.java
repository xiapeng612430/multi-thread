package cyclicBarrier.cyclicBarrier_run3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:57 下午
 */
public class MyService {

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束了 " + System.currentTimeMillis());
        }
    });

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备" + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("Thread-0")) {
                System.out.println("Thread-0 执行了cyclicBarrier.await(5,TimeUnit.SECONDS)");
                cyclicBarrier.await(5, TimeUnit.SECONDS);
            }

            if (Thread.currentThread().getName().equals("Thread-1")) {
                System.out.println("Thread-1 执行了cyclicBarrier.await()");
                cyclicBarrier.await();
            }

            System.out.println(Thread.currentThread().getName() + "开始" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "进入了catch：InterruptedException");
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println(Thread.currentThread().getName() + "进入了catch：BrokenBarrierException");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println(Thread.currentThread().getName() + "进入了catch：TimeoutException");
            e.printStackTrace();
        }
    }
}
