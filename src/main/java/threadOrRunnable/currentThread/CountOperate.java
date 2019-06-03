package threadOrRunnable.currentThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:23
 */
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate --- begin");
        System.out.println("Thread.currentThread().getName= " + Thread.currentThread().getName());
        System.out.println("this.getName= " + this.getName());
        System.out.println("CountOperate --- end");
    }

    @Override
    public void run() {
        System.out.println("run --- begin");
        System.out.println("Thread.currentThread().getName= " + Thread.currentThread().getName());
        System.out.println("this.getName= " + this.getName());
        System.out.println("run --- end");
    }
}
