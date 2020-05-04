package cyclicBarrier.cyclicBarrierBegin;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/4 10:43 下午
 */
public class Run {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("全都到了");
            }
        });

        MyThread[] myThreads = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            myThreads[i] = new MyThread(cyclicBarrier);
        }
        for (int i = 0; i < 5; i++) {
            myThreads[i].start();
        }
    }
}
