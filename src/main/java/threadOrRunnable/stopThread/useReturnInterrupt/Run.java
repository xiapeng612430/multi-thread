package threadOrRunnable.stopThread.useReturnInterrupt;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:26
 */
public class Run {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
