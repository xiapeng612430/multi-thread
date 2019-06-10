package lock.MustUseMoreCondition_Error;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:44
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll();
    }
}
