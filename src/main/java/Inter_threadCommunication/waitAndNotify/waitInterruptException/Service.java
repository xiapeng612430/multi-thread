package Inter_threadCommunication.waitAndNotify.waitInterruptException;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:40
 */
public class Service {

    public void testMethos(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                lock.wait();
                System.out.println("end   wait()");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("wait thread interrupted");
        }
    }
}
