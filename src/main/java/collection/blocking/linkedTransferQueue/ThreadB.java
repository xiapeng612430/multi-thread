package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:25 下午
 */
public class ThreadB extends Thread {

    private MyServiceB myService;

    public ThreadB(MyServiceB myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            myService.transferQueue.transfer("i'm from Thread B");
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
