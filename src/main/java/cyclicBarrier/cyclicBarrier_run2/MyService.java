package cyclicBarrier.cyclicBarrier_run2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:34 下午
 */
public class MyService {

    private CyclicBarrier cyclicBarrier;

    public MyService(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    private void beginRun(int count) {
        try {
            System.out.println(Thread.currentThread().getName() + " 到了，在等待其他人都到了开始起跑");
            if (Thread.currentThread().getName().equals("Thread-2")) {
                System.out.println("Thread-2进来了");
                Thread.sleep(5000);
                // Integer.parseInt("a");
                Thread.currentThread().interrupt();
            }
            cyclicBarrier.await();
            System.out.println("都到了，开始跑");
            System.out.println(Thread.currentThread().getName() + " 到达终点，并结束第" + count + "赛段");

        } catch (InterruptedException e) {
            System.out.println("进入了InterruptedException " + cyclicBarrier.isBroken());
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("进入了BrokenBarrierException " + cyclicBarrier.isBroken());
            e.printStackTrace();
        }
    }

    public void testA() {
        for (int i = 0; i < 1; i++) {
            beginRun(i + 1);
        }
    }
}

