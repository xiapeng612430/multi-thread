package synchronizedAndVolatile.synchronizedMethodLockObject;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 15:17
 */
public class MyObject {

    synchronized  public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
