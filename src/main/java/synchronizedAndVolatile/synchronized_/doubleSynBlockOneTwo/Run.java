package synchronizedAndVolatile.synchronized_.doubleSynBlockOneTwo;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 10:55
 */
public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
