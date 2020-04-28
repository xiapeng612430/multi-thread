package countDownLatch.countDownLatch_wait;

/**
 * Created by xianpeng.xia
 * on 2020/4/28 11:52 下午
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
