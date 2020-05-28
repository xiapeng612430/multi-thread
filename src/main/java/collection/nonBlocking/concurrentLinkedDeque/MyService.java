package collection.nonBlocking.concurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @date 2020/05/28
 * @time 16:29
 */
public class MyService {

    public ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque<>();

    public MyService() {
        for (int i = 0; i < 10000; i++) {
            concurrentLinkedDeque.add("string" + (i + 1));
        }
    }
}
