package Inter_threadCommunication.join.join_sleep_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:25
 */
public class ThreadC extends Thread {

    private ThreadB b;

    public ThreadC(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}
