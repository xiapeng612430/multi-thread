package cyclicBarrier.cyclicBarrier_run2;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:47 下午
 */
public class Test {

    public static void main(String[] args) {
        int parties = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Runnable() {
            @Override
            public void run() {
                System.out.println("都到了");
            }
        });

        MyService myService = new MyService(cyclicBarrier);
        MyThread[] threads = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new MyThread(myService);
            threads[i].start();
        }
    }
}
