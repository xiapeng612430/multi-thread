package synchronizedAndVolatile.synchronized_.synLockIn_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:49
 */
public class Service {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}
