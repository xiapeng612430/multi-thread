package synchronizedAndVolatile.synchronized_.synchronizedMethodLockObject;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 15:20
 */
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
