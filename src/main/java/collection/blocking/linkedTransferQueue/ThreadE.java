package collection.blocking.linkedTransferQueue;

import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:56 下午
 */
public class ThreadE extends Thread {

    private MyService myService;

    public ThreadE(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            System.out.println("tryTransfer(...) " + myService.transferQueue.tryTransfer("A", 5, TimeUnit.SECONDS));
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
