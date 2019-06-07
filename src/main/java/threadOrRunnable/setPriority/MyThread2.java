package threadOrRunnable.setPriority;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:55
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("myThread2 run priority= " + this.getPriority());
    }
}
