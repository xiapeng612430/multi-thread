package threadOrRunnable.isAlive;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:32
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run= " + this.isAlive());
    }

}
