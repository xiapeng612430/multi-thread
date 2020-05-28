package collection.blocking.synchronousQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 9:39 下午
 */
public class ThreadPut extends Thread {

    private MyService myService;

    public ThreadPut(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            myService.put();
        }
    }
}
