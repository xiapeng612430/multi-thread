package threadOrRunnable.setPriority.extThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 13:49
 */
public class ThreadA extends Thread {

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
