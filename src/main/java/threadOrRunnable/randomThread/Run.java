package threadOrRunnable.randomThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 07:09
 */
public class Run {

    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
        System.out.println("run over");
    }
}
