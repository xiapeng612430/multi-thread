package Inter_threadCommunication.waitAndNotify.waitHasParamMethod;

import synchronizedAndVolatile.synchronized_.synBlockMoreObjectOneLock.Service;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 10:16
 */
public class MyRunnable {

    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer = " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait   end timer = " + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(runnable1);
        thread.start();
    }
}
