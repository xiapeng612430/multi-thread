package collection.nonBlocking.concurrentSkipListSet;

/**
 * @date 2020/05/28
 * @time 15:30
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            while (!myService.concurrentSkipListSet.isEmpty()) {
                UserInfo userInfo = (UserInfo) myService.concurrentSkipListSet.pollFirst();
                System.out.println("id: " + userInfo.getId() + " username: " + userInfo.getUsername());
                Thread.sleep((long) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
