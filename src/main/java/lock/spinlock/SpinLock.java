package lock.spinlock;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @date 2021/01/09
 * @time 下午4:48
 */
public class SpinLock {

    private AtomicReference<Thread> sign = new AtomicReference<>();

    public void lock() {
        Thread current = Thread.currentThread();
        while (!sign.compareAndSet(null, current)) {
            System.out.println("Get lock failed...");
        }
    }

    public void unLock() {
        Thread current = Thread.currentThread();
        sign.compareAndSet(current, null);

    }

    public static void main(String[] args) {
        SpinLock spinLock = new SpinLock();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Try get lock... " + Thread.currentThread().getName());
                spinLock.lock();
                System.out.println("Get lock... " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    spinLock.unLock();
                    System.out.println("Unlock... " + Thread.currentThread().getName());
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
