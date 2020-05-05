package cyclicBarrier.cyclicBarrier_run5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:23 上午
 */
public class MyService {

    public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束了 " + System.currentTimeMillis());
        }
    });

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName()+"准备"+System.currentTimeMillis());
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName()+"结束"+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
