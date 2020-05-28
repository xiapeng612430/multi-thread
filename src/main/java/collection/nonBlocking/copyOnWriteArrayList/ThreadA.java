package collection.nonBlocking.copyOnWriteArrayList;

/**
 * @date 2020/05/28
 * @time 17:38
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {

        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myService.copyOnWriteArrayList.add("anything");
        }
    }
}
