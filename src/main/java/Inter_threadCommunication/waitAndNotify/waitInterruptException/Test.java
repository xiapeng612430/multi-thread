package Inter_threadCommunication.waitAndNotify.waitInterruptException;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:45
 */
public class Test {

    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
