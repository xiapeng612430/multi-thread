package cyclicBarrier.cyclicBarrierAwaitAfterReset0;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/4 11:03 下午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        ThreadA threadA1 = new ThreadA(cyclicBarrier);
        threadA1.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        ThreadA threadA2 = new ThreadA(cyclicBarrier);
        threadA2.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        ThreadA threadA3 = new ThreadA(cyclicBarrier);
        threadA3.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        ThreadA threadA4 = new ThreadA(cyclicBarrier);
        threadA4.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());
    }
}
