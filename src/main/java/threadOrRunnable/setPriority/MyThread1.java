package threadOrRunnable.setPriority;


/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:48
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
    System.out.println("myThread1 run priority= "+this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
