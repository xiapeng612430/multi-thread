package threadOrRunnable.stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 11:36
 */
public class RunTestIsInterrupted {

    public static void main(String[] args) {

        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1?" + thread.isInterrupted());
            System.out.println("是否停止2?" + thread.isInterrupted());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
