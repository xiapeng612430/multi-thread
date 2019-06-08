package synchronizedAndVolatile.synchronized_.twoStop;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:47
 */
public class Service {

    private Object object1 = new Object();

    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("methodA end");
        }
    }

    private Object object2 = new Object();

    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
