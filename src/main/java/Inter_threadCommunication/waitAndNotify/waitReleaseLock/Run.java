package Inter_threadCommunication.waitAndNotify.waitReleaseLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:09
 */
public class Run {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
