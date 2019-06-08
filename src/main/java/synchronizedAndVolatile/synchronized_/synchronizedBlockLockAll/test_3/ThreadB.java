package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_3;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 17:14
 */
public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
