package collection.nonBlocking.concurrentLinkedQueue;

/**
 * @date 2020/05/28
 * @time 15:44
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            myService.concurrentLinkedQueue.add("ThreadA" + (i + 1));
        }
    }
}
