package collection.nonBlocking.concurrentHashMap;

/**
 * @date 2020/05/28
 * @time 09:51
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            myService.concurrentHashMap.put("ThreadA" + (i + 1), "ThreadA" + (i + 1));
            System.out.println("ThreadA" + (i + 1));
        }
    }
}
