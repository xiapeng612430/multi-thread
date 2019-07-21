package Inter_threadCommunication.waitAndNotify.wait_notify_size5;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:58
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("send notify");
                    }
                    System.out.println("added " + (i + 1) + " elements");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
