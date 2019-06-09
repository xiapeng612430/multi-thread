package Inter_threadCommunication.waitAndNotify.p_c_allWait;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:55
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] pThreads = new ThreadP[2];
        ThreadC[] cThreads = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            pThreads[i] = new ThreadP(p);
            pThreads[i].setName("生产者->" + (i + 1));
            cThreads[i] = new ThreadC(c);
            cThreads[i].setName("消费者->" + (i + 1));
            pThreads[i].start();
            cThreads[i].start();
        }

        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for (int i = 0; i < threadArray.length; i++) {
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());

        }
    }
}
