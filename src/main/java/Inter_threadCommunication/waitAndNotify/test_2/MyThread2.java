package Inter_threadCommunication.waitAndNotify.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:50
 */
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("begin notify time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println("end   nofify time = " + System.currentTimeMillis());
        }
    }
}
