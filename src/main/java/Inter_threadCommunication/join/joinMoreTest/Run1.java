package Inter_threadCommunication.join.joinMoreTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:41
 */
public class Run1 {

    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("                   main end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
