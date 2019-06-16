package lock.ReadWriteLockBegin3;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:10
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
