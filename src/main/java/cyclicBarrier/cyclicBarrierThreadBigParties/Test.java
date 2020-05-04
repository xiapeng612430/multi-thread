package cyclicBarrier.cyclicBarrierThreadBigParties;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/4 10:56 下午
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("全来了");
            }
        });

        for (int i = 0; i < 4; i++) {
            ThreadA threadA = new ThreadA(cyclicBarrier);
            threadA.start();
            Thread.sleep(2000);
        }
    }
}
