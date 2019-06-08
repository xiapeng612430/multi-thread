package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 13:32
 */
public class MyObject {

    synchronized public void speedPrintString() {
        System.out.println("speedPrintString _____getLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
        System.out.println("---------------------------");
        System.out.println("speedPrintString _____releaseLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
    }
}
