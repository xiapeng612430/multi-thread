package synchronizedAndVolatile.synchronized_.synchronizedOneThreadIn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 09:36
 */
public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
