package threadOrRunnable.randomThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-02 22:17
 */
public class ExThread extends Thread {

    private int i;

    public ExThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
