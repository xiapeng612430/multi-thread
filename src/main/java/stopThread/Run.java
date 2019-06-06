package stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 10:43
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
