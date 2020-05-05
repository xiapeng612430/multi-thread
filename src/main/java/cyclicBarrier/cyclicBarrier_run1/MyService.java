package cyclicBarrier.cyclicBarrier_run1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:16 下午
 */
public class MyService {

    private CyclicBarrier cyclicBarrier;

    public MyService(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    public void beginRun() {
        try {
            long sleepValue = (int) (Math.random() * 10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " begin跑第一阶段" + (cyclicBarrier.getNumberWaiting() + 1));
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "   end跑第一阶段" + cyclicBarrier.getNumberWaiting() );

            sleepValue = (int) (Math.random() * 10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " begin跑第二阶段" + (cyclicBarrier.getNumberWaiting() + 1));
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "   end跑第二阶段" + cyclicBarrier.getNumberWaiting() );

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
