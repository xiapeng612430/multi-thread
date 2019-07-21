package countDownLatch.countDownLatch_test1;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 12:07
 */
public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
