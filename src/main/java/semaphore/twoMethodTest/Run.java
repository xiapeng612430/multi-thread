package semaphore.twoMethodTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-20 23:56
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread firstThread = new MyThread(service);
        firstThread.start();
        MyThread[] threadArray = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].start();
        }
    }
}
