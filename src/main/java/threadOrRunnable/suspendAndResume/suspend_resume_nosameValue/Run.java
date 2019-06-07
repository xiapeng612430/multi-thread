package threadOrRunnable.suspendAndResume.suspend_resume_nosameValue;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:25
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
                myObject.setValue("a", "aa");
            }
        };
        thread1.setName("a");
        thread1.start();
        Thread.sleep(500);

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                super.run();
                myObject.printUsernamePassword();
            }
        };
        thread2.start();

    }
}
