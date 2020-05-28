package collection.nonBlocking.concurrentLinkedDeque;

/**
 * @date 2020/05/28
 * @time 16:30
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        while (!myService.concurrentLinkedDeque.isEmpty()) {
            myService.concurrentLinkedDeque.pollFirst();
            System.out.println("thread a get size: " + myService.concurrentLinkedDeque.size());
        }
    }
}
