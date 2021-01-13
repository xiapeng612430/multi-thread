package lock.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @date 2021/01/13
 * @time 15:36
 */
public class ConditionRun {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    void methodA() {
        lock.lock();
        try {
            System.out.println("条件不满足,开始await...");
            condition.await();
            System.out.println("条件满足,开始执行后续任务...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void methodB() {
        lock.lock();
        try {
            System.out.println("准备工作完成,唤醒其他线程...");
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ConditionRun conditionRun = new ConditionRun();
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            conditionRun.methodB();
        }).start();
        conditionRun.methodA();
    }
}
