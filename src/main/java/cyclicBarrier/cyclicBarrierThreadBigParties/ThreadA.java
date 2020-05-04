package cyclicBarrier.cyclicBarrierThreadBigParties;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/4 10:51 下午
 */
public class ThreadA extends Thread {

    private CyclicBarrier cyclicBarrier;

    public ThreadA(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "begin = " + System.currentTimeMillis() + " 等待凑齐两个继续运行");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + "  end = " + System.currentTimeMillis() + " 已经凑齐两个继续运行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
