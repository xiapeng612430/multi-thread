package locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @author xianpeng.xia
 * on 2022/4/23 6:33 PM
 *
 * 使用两个线程交替打印出A1B2C3…Z26
 */
public class PrintChar {

    static Thread t1 = null;
    static Thread t2 = null;

    public static void main(String[] args) {
        t1 = new Thread(() -> {

            for (int i = 1; i <= 26; i++) {
                LockSupport.park();
                System.out.println(i);
                LockSupport.unpark(t2);
            }

        });

        t2 = new Thread(() -> {

            for (int i = 0; i <= 25; i++) {
                char c = (char) ('A' + i);
                System.out.println(c);
                LockSupport.unpark(t1);
                LockSupport.park();
            }

        });

        t1.start();
        t2.start();
    }
}
