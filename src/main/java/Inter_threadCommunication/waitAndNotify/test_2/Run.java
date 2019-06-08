package Inter_threadCommunication.waitAndNotify.test_2;

import threadOrRunnable.stopThread.MyThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:52
 */
public class Run {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
