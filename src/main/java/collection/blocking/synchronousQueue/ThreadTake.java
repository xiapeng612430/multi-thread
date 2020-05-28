package collection.blocking.synchronousQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 9:40 下午
 */
public class ThreadTake extends Thread {

    private MyService myService;

    public ThreadTake(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myService.take();
        }
    }
}
