package synchronizedAndVolatile.synchronized_.synchronizedMethodLockObject2;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 15:31
 */
public class MyObject {

    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("threadName=" + Thread.currentThread().getName() + " end endTime=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        try {
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("threadName=" + Thread.currentThread().getName() + " end endTime=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
