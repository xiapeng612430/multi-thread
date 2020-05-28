package collection.nonBlocking.concurrentHashMap;

import java.util.Iterator;

/**
 * @date 2020/05/28
 * @time 09:54
 */
public class ThreadC extends Thread {

    private MyService myService;

    public ThreadC(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        Iterator iterator = myService.concurrentHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(">>" + next.toString());
        }
    }
}
