package collection.nonBlocking.concurrentLinkedDeque;

/**
 * @date 2020/05/28
 * @time 16:34
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        while (!myService.concurrentLinkedDeque.isEmpty()) {
            myService.concurrentLinkedDeque.pollLast();
            System.out.println("thread b get size: " + myService.concurrentLinkedDeque.size());
        }
    }
}
