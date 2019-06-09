package Inter_threadCommunication.waitAndNotify.notifyHoldLock;

import threadOrRunnable.stopThread.stopThrowLock.SynchrobnizedObject;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:33
 */
public class Test {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.setName("A");
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.setName("N");
        notifyThread.start();
        SynNotifyMethodThread synNotifyMethodThread = new SynNotifyMethodThread(lock);
        synNotifyMethodThread.setName("S");
        synNotifyMethodThread.start();
    }
}
