package synchronizedAndVolatile.synchronized_.synLockIn_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:01
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
