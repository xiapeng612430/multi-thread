package threadOrRunnable;

/**
 * Created by xianpeng.xia
 * on 2019-06-02 22:00
 */
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("run end");
    }
}
