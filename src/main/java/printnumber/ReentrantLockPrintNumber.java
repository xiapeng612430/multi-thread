package printnumber;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xianpeng.xia
 * on 2022/4/23 8:18 PM
 */
public class ReentrantLockPrintNumber implements Runnable {

    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static int cnt;
    private int remainder;

    public ReentrantLockPrintNumber(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (cnt < 100) {
            lock.lock();
            try {
                if (cnt % 3 == remainder) {
                    cnt++;
                    System.out.println(Thread.currentThread().getName() + " " + cnt);
                } else {
                    condition.await();
                }
                condition.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ReentrantLockPrintNumber(0));
        Thread t2 = new Thread(new ReentrantLockPrintNumber(1));
        Thread t3 = new Thread(new ReentrantLockPrintNumber(2));

        t1.start();
        t2.start();
        t3.start();
    }
}
