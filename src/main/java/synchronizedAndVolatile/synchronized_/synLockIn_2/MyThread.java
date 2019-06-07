package synchronizedAndVolatile.synchronized_.synLockIn_2;


/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:00
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
