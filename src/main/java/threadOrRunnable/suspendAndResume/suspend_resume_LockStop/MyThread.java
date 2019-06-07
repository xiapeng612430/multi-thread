package threadOrRunnable.suspendAndResume.suspend_resume_LockStop;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:15
 */
public class MyThread extends Thread {

    private long i = 0;

    @Override
    public void run() {
        super.run();
        while (true) {
            i++;
            System.out.println("i = " + i);
        }
    }
}
