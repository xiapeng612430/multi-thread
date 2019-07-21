package threadOrRunnable.isAlive;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:33
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();
        System.out.println("begin == " + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end == " + myThread.isAlive());
    }
}
