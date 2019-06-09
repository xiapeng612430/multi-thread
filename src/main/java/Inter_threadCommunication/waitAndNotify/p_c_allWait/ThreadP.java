package Inter_threadCommunication.waitAndNotify.p_c_allWait;


/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:22
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
