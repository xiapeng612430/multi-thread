package stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 13:27
 */
public class RunTestStop {

    public static void main(String[] args) {
        try {
            MyThread4 thread4 = new MyThread4();
            thread4.start();
            Thread.sleep(8000);
            thread4.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
