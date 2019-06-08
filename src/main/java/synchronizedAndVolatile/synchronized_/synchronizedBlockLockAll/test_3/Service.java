package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_3;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 17:09
 */
public class Service {

    public void testMethod(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMthod _____getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMthod _____releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
