package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_3;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 17:49
 */
public class MyObject {

    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString ___getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
            System.out.println("---------------------");
            System.out.println("speedPrintString ___releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
        }
    }
}
