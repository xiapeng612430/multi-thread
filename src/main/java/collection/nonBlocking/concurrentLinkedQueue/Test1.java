package collection.nonBlocking.concurrentLinkedQueue;

/**
 * @date 2020/05/28
 * @time 16:23
 */
public class Test1 {

    public static void main(String[] args) {
        MyService myService = new MyService();
        myService.concurrentLinkedQueue.add("A");
        myService.concurrentLinkedQueue.add("B");
        myService.concurrentLinkedQueue.add("C");
        System.out.println(myService.concurrentLinkedQueue.poll());
    }
}
