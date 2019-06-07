package threadOrRunnable.yield;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:44
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
