package collection.blocking.priorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @date 2020/05/28
 * @time 18:35
 */
public class Test {

    public static void main(String[] args) {
        PriorityBlockingQueue<UserInfo> priorityBlockingQueue = new PriorityBlockingQueue<>();

        priorityBlockingQueue.add(new UserInfo(12));
        priorityBlockingQueue.add(new UserInfo(13478));
        priorityBlockingQueue.add(new UserInfo(1569));
        priorityBlockingQueue.add(new UserInfo(1346));
        priorityBlockingQueue.add(new UserInfo(1762));
        priorityBlockingQueue.add(new UserInfo(1898123));

        System.out.println(priorityBlockingQueue.poll().getId());
        System.out.println(priorityBlockingQueue.poll().getId());
        System.out.println(priorityBlockingQueue.poll().getId());
        System.out.println(priorityBlockingQueue.poll().getId());
        System.out.println(priorityBlockingQueue.poll().getId());
        System.out.println(priorityBlockingQueue.poll().getId());
        System.out.println(priorityBlockingQueue.poll());
    }
}
