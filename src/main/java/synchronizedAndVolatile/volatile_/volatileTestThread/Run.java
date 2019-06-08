package synchronizedAndVolatile.volatile_.volatileTestThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 21:51
 */
public class Run {

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
