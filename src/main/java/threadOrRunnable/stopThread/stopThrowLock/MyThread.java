package threadOrRunnable.stopThread.stopThrowLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:10
 */
public class MyThread extends Thread {

    private SynchrobnizedObject synchrobnizedObject;

    public MyThread(SynchrobnizedObject synchrobnizedObject) {
        this.synchrobnizedObject = synchrobnizedObject;
    }

    @Override
    public void run() {
        super.run();
        synchrobnizedObject.printString("b","bb");
    }
}
