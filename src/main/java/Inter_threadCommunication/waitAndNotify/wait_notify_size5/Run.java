package Inter_threadCommunication.waitAndNotify.wait_notify_size5;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 02:06
 */
public class Run {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadB waitThread = new ThreadB(lock);
            waitThread.start();
            Thread.sleep(500);
            ThreadA notifyThread = new ThreadA(lock);
            notifyThread.start();

        } catch (InterruptedException e) {

        }
    }
}
