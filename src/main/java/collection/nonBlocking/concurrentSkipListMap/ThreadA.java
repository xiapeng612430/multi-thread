package collection.nonBlocking.concurrentSkipListMap;

import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @date 2020/05/28
 * @time 15:02
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        try {
            while (!myService.concurrentSkipListMap.isEmpty()) {
                Entry entry = myService.concurrentSkipListMap.pollFirstEntry();
                UserInfo userInfo = (UserInfo) entry.getKey();
                System.out.println("id: " + userInfo.getId() + " username: " + userInfo.getUsername());
                Thread.sleep((long) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
