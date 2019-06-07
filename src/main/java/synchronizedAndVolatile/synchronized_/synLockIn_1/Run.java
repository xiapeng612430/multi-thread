package synchronizedAndVolatile.synchronized_.synLockIn_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:53
 */
public class Run {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
