package threadOrRunnable.randomThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 07:23
 */
public class SubTest {

    public static void main(String[] args) {
        ThreadSub threadSub = new ThreadSub();
        Thread t1 = new Thread(threadSub, "a");
        Thread t2 = new Thread(threadSub, "b");
        Thread t3 = new Thread(threadSub, "c");
        Thread t4 = new Thread(threadSub, "d");
        Thread t5 = new Thread(threadSub, "e");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
