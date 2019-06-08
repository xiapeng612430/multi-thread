package synchronizedAndVolatile.volatile_.atomicIntegerNotSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:11
 */
public class MyService {

    public static AtomicLong sum = new AtomicLong();

    public void addSum() {
        System.out.println(Thread.currentThread().getName() + " add 100 and then sum = " + sum.addAndGet(100));
        sum.addAndGet(1);
    }
}
