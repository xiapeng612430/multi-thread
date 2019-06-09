package Inter_threadCommunication.waitAndNotify.notifyAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:50
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() Thread name = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end   wait() Thread name = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
