package Inter_threadCommunication.waitAndNotify.p_c_allWait;

import Inter_threadCommunication.waitAndNotify.p_c_test.ValueObject;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:33
 */
public class C {

    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 : " + Thread.currentThread().getName() + " WAITING &");
                    lock.wait();
                }
                System.out.println("消费者 : " + Thread.currentThread().getName() + " RUNNABLE &");
                ValueObject.value = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
