package lock.UseConditionWaitNotifyOk;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:33
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
