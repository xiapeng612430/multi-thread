package collection.blocking.arrayBlockingQueue;

import executors.queue_diff_big_test.ArrayBlockingQueueTest1;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @date 2020/05/28
 * @time 18:23
 */
public class Put {

    public static void main(String[] args) {
        try {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);
            arrayBlockingQueue.put("a");
            arrayBlockingQueue.put("b");
            arrayBlockingQueue.put("c");
            System.out.println("size: " + arrayBlockingQueue.size());
            System.out.println(System.currentTimeMillis());
            arrayBlockingQueue.put("d");
            System.out.println(System.currentTimeMillis());
            System.out.println("size: " + arrayBlockingQueue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
