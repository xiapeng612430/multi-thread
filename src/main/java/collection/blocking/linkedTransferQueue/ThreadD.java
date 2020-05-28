package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:56 下午
 */
public class ThreadD extends Thread {

    private MyService myService;

    public ThreadD(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        System.out.println("tryTransfer() " + myService.transferQueue.tryTransfer("A"));
        System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
    }
}
