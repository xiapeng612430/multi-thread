package threadOrRunnable.sleep;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 09:02
 */
public class MyThred1 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName= " + Thread.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName= " + Thread.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
