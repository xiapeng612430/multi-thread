package stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 12:26
 */
public class RunTestStopInSleep {

    public static void main(String[] args) {
        try {
            MyThread3 thread = new MyThread3();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end !");
    }
}
