package Inter_threadCommunication.waitAndNotify.wait_notify_size5;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 02:02
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin time = " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end   time = " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
