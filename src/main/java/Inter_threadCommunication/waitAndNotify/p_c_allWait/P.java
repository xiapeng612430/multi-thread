package Inter_threadCommunication.waitAndNotify.p_c_allWait;

import Inter_threadCommunication.waitAndNotify.p_c_test.ValueObject;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:30
 */
public class P {

    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者: " + Thread.currentThread().getName() + " WAITING *");
                    lock.wait();
                }
                System.out.println("生产者: " + Thread.currentThread().getName() + " RUNNABLE *");
                String value = System.currentTimeMillis() + "+" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
