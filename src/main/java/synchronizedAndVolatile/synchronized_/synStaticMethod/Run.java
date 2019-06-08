package synchronizedAndVolatile.synchronized_.synStaticMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:04
 */
public class Run {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}
