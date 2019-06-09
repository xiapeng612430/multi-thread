package Inter_threadCommunication.join.joinException;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:06
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
