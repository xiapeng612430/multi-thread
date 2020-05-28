package collection.blocking.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @date 2020/05/28
 * @time 18:29
 */
public class Take {

    public static void main(String[] args) {
        try {
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(3);
            System.out.println("begin " + System.currentTimeMillis());
            arrayBlockingQueue.take();
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
