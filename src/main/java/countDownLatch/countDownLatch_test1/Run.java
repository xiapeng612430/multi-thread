package countDownLatch.countDownLatch_test1;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 12:09
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        myThread.start();
        Thread.sleep(2000);
        myService.downMethod();
    }
}
