package synchronizedAndVolatile.synchronized_.synStaticMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 17:58
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
}
