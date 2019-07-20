package semaphore.semphore_moreToOne_1;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 01:00
 */
public class Service {

    private Semaphore semaphore = new Semaphore(3);

    void sayHello() {
        try {
            semaphore.acquire();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " ready ");
            System.out.println("begin hello " + System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " print " + (i + 1));
            }
            System.out.println("end   hello " + System.currentTimeMillis());
            semaphore.release();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
