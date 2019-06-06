package stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 12:23
 */
public class MyThread3 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中，进入catch ! " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
