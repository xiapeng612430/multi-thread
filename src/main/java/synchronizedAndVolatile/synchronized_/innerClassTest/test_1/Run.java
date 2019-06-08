package synchronizedAndVolatile.synchronized_.innerClassTest.test_1;

import synchronizedAndVolatile.synchronized_.innerClassTest.test_1.OutClass.Inner;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:08
 */
public class Run {

    public static void main(String[] args) {
        final Inner inner = new Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        }, "A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        }, "B");

        t1.start();
        t2.start();
    }
}
