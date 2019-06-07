package synchronizedAndVolatile.synchronized_.synNotExtends;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:45
 */
public class MyThreadB extends Thread {

    private Sub sub;

    public MyThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
