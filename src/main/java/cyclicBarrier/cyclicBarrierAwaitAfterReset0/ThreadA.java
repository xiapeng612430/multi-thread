package cyclicBarrier.cyclicBarrierAwaitAfterReset0;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/4 11:01 下午
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
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
