package Inter_threadCommunication.waitAndNotify.p_c_test;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:24
 */
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);
        pThread.start();
        cThread.start();
    }
}
