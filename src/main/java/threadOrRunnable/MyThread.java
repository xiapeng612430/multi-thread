package threadOrRunnable;

/**
 * Created by xianpeng.xia
 * on 2019-06-02 21:59
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("myThread");
    }
}
