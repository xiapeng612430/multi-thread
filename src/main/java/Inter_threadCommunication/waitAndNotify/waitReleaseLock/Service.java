package Inter_threadCommunication.waitAndNotify.waitReleaseLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:02
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end wait()");
            }
        } catch (InterruptedException e) {
        }
    }
}
