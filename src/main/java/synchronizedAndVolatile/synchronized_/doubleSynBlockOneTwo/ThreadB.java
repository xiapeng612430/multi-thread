package synchronizedAndVolatile.synchronized_.doubleSynBlockOneTwo;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 10:54
 */
public class ThreadB extends Thread {

    private ObjectService servicel;

    public ThreadB(ObjectService servicel) {
        super();
        this.servicel = servicel;
    }

    @Override
    public void run() {
        super.run();
        servicel.serviceMethodB();
    }
}
