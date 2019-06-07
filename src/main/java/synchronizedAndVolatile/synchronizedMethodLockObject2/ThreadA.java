package synchronizedAndVolatile.synchronizedMethodLockObject2;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:18
 */
public class ThreadA extends Thread {

    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
