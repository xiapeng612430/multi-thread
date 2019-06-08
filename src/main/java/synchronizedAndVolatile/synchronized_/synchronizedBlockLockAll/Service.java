package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:45
 */
public class Service {

    public void testMethodA(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethodA ______getLock time = " + System.currentTimeMillis() + " run threadName : " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethodA ______releaseLock time = " + System.currentTimeMillis() + " run threadName : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
