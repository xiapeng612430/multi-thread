package Inter_threadCommunication.waitAndNotify.p_c_allWait;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:23
 */
public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
