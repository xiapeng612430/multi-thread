package cyclicBarrier.cyclicBarrier_run4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:13 上午
 */
public class MyService {

    public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("结束 " + System.currentTimeMillis());
        }
    });

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备" + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("C")) {
                Thread.sleep(Integer.MAX_VALUE);
            }
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + "开始" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
