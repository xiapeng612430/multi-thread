package synchronizedAndVolatile.synchronized_.synTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:07
 */
public class Service {

    synchronized public static void printA() {
        try {
            System.out.println("thread name : " + Thread.currentThread().getName() + " in " + System.currentTimeMillis() + " enter printA method");
            Thread.sleep(3000);
            System.out.println("thread name : " + Thread.currentThread().getName() + " in " + System.currentTimeMillis() + " leave printA method");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("thread name : " + Thread.currentThread().getName() + " in " + System.currentTimeMillis() + " enter printB method");
        System.out.println("thread name : " + Thread.currentThread().getName() + " in " + System.currentTimeMillis() + " leave printB method");
    }

    synchronized public void printC() {
        System.out.println("thread name : " + Thread.currentThread().getName() + " in " + System.currentTimeMillis() + " enter printC method");
        System.out.println("thread name : " + Thread.currentThread().getName() + " in " + System.currentTimeMillis() + " leave printC method");
    }
}
