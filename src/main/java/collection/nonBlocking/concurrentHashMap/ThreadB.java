package collection.nonBlocking.concurrentHashMap;

/**
 * @date 2020/05/28
 * @time 09:54
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            myService.concurrentHashMap.put("ThreadB" + (i + 1), "ThreadB" + (i + 1));
            System.out.println("ThreadB" + (i + 1));
        }
    }
}
