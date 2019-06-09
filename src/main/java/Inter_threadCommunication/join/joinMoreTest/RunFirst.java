package Inter_threadCommunication.join.joinMoreTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:47
 */
public class RunFirst {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("                   main end = " + System.currentTimeMillis());
    }
}
