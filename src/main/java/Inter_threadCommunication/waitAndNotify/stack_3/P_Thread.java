package Inter_threadCommunication.waitAndNotify.stack_3;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 19:22
 */
public class P_Thread extends Thread {

    private P p;

    public P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.pushService();
        }
    }
}
