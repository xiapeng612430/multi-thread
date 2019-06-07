package synchronizedAndVolatile.synchronized_.synNotExtends;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:44
 */
public class MyThreadA extends Thread {

    private Sub sub;

    public MyThreadA(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
