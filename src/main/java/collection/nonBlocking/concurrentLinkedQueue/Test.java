package collection.nonBlocking.concurrentLinkedQueue;

/**
 * @date 2020/05/28
 * @time 16:20
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            ThreadB threadB = new ThreadB(myService);
            threadA.start();
            threadB.start();

            threadA.join();
            threadB.join();
            System.out.println(myService.concurrentLinkedQueue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
