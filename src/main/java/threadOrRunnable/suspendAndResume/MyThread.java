package threadOrRunnable.suspendAndResume;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:31
 */
public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            i++;
        }
    }
}
