package countDownLatch.countDownLatch_wait;

/**
 * Created by xianpeng.xia
 * on 2020/4/28 11:51 下午
 */
public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread[] myThreads = new MyThread[3];
        for (int i = 0; i < myThreads.length; i++) {
            MyThread myThread = new MyThread(myService);
            myThread.setName("Thread" + i);
            myThreads[i] = myThread;
            myThreads[i].start();
        }

    }
}
