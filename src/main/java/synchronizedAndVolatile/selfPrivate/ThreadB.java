package synchronizedAndVolatile.selfPrivate;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 14:44
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRed) {
        super();
        this.numRef = numRed;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
