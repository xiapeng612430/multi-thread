package threadOrRunnable.stopThread.stopThrowLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:18
 */
public class Run {

    public static void main(String[] args) {
        try {
            SynchrobnizedObject object = new SynchrobnizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
