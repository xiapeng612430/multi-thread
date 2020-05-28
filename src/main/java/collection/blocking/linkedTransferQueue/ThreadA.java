package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:21 下午
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            System.out.println("take: " + myService.transferQueue.take());
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
