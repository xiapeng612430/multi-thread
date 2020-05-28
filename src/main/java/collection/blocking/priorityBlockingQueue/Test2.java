package collection.blocking.priorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @date 2020/05/28
 * @time 18:40
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            PriorityBlockingQueue<UserInfo> priorityBlockingQueue = new PriorityBlockingQueue<>();
            System.out.println("begin");
            System.out.println(priorityBlockingQueue.take());
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
