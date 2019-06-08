package synchronizedAndVolatile.synchronized_.innerClassTest.test_2;

import synchronizedAndVolatile.synchronized_.innerClassTest.test_2.OutClass.InnerClass1;
import synchronizedAndVolatile.synchronized_.innerClassTest.test_2.OutClass.InnerClass2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:21
 */
public class Run {

    public static void main(String[] args) {
        final InnerClass1 innerClass1 = new InnerClass1();
        final InnerClass2 innerClass2 = new InnerClass2();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1(innerClass2);
            }
        }, "T1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method2();
            }
        }, "T2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method1();
            }
        }, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
