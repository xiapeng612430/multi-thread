package collection.nonBlocking.concurrentLinkedDeque;

/**
 * @date 2020/05/28
 * @time 16:32
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadA a = new ThreadA(myService);
            ThreadB b = new ThreadB(myService);

            a.start();
            b.start();
            a.join();
            b.join();
            System.out.println(myService.concurrentLinkedDeque.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
