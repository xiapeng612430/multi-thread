package threadOrRunnable.randomThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 07:21
 */
public class ThreadSub extends Thread {

    private int i = 5;

    @Override
    synchronized public void run() {
        super.run();
        i--;
        System.out.println("thread : " + Thread.currentThread().getName() + " sub count = " + i);
    }
}
