package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:30 下午
 */
public class    ThreadC extends Thread {

    private MyService myService;

    public ThreadC(MyService myService) {

        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
           myService.transferQueue.transfer("i'm form thread c");
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
