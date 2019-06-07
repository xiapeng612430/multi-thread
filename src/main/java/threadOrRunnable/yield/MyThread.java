package threadOrRunnable.yield;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:32
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            int count = 0;
            //Thread.yield();
            count = count + (i + 1);
        }
        long end = System.currentTimeMillis();
        System.out.println("cost : " + (end - start) + " ms");
    }
}
