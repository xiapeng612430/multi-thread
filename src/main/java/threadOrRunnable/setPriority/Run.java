package threadOrRunnable.setPriority;

import threadOrRunnable.stopThread.MyThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:56
 */
public class Run {

    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority= " + Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
    }
}
