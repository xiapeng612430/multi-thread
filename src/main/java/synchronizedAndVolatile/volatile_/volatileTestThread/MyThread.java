package synchronizedAndVolatile.volatile_.volatileTestThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 21:49
 */
public class MyThread extends Thread {

    volatile public static int count;

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
