package semaphore.semaphoreFairTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:25
 */
public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread firstThread = new MyThread(myService);
        firstThread.setName("first thread");
        firstThread.start();
        MyThread[] myThreads = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            myThreads[i] = new MyThread(myService);
            myThreads[i].setName(i + " th thread");
            myThreads[i].start();
        }
    }
}
