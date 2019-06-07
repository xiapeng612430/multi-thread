package synchronizedAndVolatile.synchronized_.dirtyRead;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:37
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setVaule("b", "bb");
    }
}
