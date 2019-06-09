package Inter_threadCommunication.join.join_sleep_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:21
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("   b run begin timer = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("   b run   end timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("print bService timer = " + System.currentTimeMillis());
    }
}
