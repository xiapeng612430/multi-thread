package threadOrRunnable.stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 12:11
 */
public class RunTestExceptionInterrupt {

    public static void main(String[] args) {
        try {
            MyThread2 myThread2 = new MyThread2();
            myThread2.start();
            Thread.sleep(2000);
            myThread2.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
