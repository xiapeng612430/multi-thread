package threadOrRunnable.suspendAndResume.suspend_resume_deal_lock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:47
 */
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println();
    }
}
