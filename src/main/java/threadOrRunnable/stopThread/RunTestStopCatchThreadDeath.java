package threadOrRunnable.stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 10:54
 */
public class RunTestStopCatchThreadDeath {

    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.start();
    }
}
