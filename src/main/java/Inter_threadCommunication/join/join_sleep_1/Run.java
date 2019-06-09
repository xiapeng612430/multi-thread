package Inter_threadCommunication.join.join_sleep_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:26
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
