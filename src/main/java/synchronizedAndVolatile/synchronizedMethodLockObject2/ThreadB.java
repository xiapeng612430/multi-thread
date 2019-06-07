package synchronizedAndVolatile.synchronizedMethodLockObject2;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:19
 */
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
