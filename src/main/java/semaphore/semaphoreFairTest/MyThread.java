package semaphore.semaphoreFairTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:25
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
