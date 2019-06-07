package threadOrRunnable.stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 10:52
 */
public class MyThread5 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            this.stop();
        } catch (ThreadDeath e) {
            e.printStackTrace();
        }
    }
}
