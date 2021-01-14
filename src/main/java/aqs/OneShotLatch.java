package aqs;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author xianpeng.xia
 * on 2021/1/14 9:32 下午
 *
 * AQS用法
 * 1. 写一个,想协作的逻辑,实现获取/释放方法
 * 2. 内部写一个Sync类继承AbstractQueuedSynchronizer
 * 3. 根据是否独占来重写 tryAcquire/tryRelease
 * 或 tryAcquireShared(int acquires)/tryReleaseShared(int releases)方法,
 * 在之前写的获取/释放方法中调用AQS的acquire/release或者Shared方法
 */
public class OneShotLatch {

    private final Sync sync = new Sync();

    public void await() {
        sync.acquireShared(0);
    }

    public void signal() {
        sync.releaseShared(1);
    }

    private class Sync extends AbstractQueuedSynchronizer {

        @Override
        protected int tryAcquireShared(int arg) {
            // state = 1 打开
            return getState() == 1 ? 1 : -1;
        }

        @Override
        protected boolean tryReleaseShared(int arg) {
            setState(1);
            return true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OneShotLatch oneShotLatch = new OneShotLatch();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " 尝试获取门闩,获取失败就等待");
                oneShotLatch.await();
                System.out.println("开闸放行 " + threadName + "继续运行");

            }).start();
        }

        Thread.sleep(5000);
        oneShotLatch.signal();

        new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 尝试获取门闩,获取失败就等待");
            oneShotLatch.await();
            System.out.println("开闸放行 " + threadName + "继续运行");

        }).start();
    }
}
