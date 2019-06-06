package sleep;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 09:38
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName = " + currentThread().getName() + " begin = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName = " + currentThread().getName() + " end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
