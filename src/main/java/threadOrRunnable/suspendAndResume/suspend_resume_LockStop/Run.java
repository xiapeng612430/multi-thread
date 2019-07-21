package threadOrRunnable.suspendAndResume.suspend_resume_LockStop;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:16
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
