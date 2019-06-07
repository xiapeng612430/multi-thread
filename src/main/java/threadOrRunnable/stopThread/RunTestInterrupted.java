package threadOrRunnable.stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 11:09
 */
public class RunTestInterrupted {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1?" + Thread.interrupted());
            System.out.println("是否停止2?" + Thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
