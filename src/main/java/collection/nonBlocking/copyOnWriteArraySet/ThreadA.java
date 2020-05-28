package collection.nonBlocking.copyOnWriteArraySet;

/**
 * @date 2020/05/28
 * @time 17:49
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myService.copyOnWriteArraySet.add(Thread.currentThread().getName() + " anything " + (i + 1));
        }
    }
}
