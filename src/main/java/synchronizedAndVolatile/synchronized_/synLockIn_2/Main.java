package synchronizedAndVolatile.synchronized_.synLockIn_2;

import synchronizedAndVolatile.synchronized_.synLockIn_1.Service;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:56
 */
public class Main {

    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i= " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
