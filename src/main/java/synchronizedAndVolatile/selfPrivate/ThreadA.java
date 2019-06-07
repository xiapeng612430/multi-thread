package synchronizedAndVolatile.selfPrivate;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 14:42
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRed) {
        super();
        this.numRef = numRed;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
