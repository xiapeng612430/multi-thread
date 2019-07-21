package synchronizedAndVolatile.volatile_.atomicIntegerNotSafe;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:22
 */
public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addSum();
    }
}
