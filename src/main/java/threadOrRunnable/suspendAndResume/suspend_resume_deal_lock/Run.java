package threadOrRunnable.suspendAndResume.suspend_resume_deal_lock;


/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:02
 */
public class Run {

    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    super.run();
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    super.run();
                    System.out.println("thread 2 begin, but cant enter method printString();only print begin");
                    System.out.println("because of printString() locked by Thread a;and thread a suspended");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
