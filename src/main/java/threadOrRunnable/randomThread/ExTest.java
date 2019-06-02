package threadOrRunnable.randomThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-02 22:18
 */
public class ExTest {

    public static void main(String[] args) {
        ExThread t1 = new ExThread(1);
        ExThread t2 = new ExThread(2);
        ExThread t3 = new ExThread(3);
        ExThread t4 = new ExThread(4);
        ExThread t5 = new ExThread(5);
        ExThread t6 = new ExThread(6);
        ExThread t7 = new ExThread(7);
        ExThread t8 = new ExThread(8);
        ExThread t9 = new ExThread(9);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();


    }
}
