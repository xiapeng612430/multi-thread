package collection.nonBlocking.concurrentLinkedQueue;

/**
 * @date 2020/05/28
 * @time 16:19
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            myService.concurrentLinkedQueue.add("ThreadB" + (i + 1));
        }
    }
}
