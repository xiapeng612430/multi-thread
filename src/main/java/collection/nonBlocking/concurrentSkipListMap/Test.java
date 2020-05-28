package collection.nonBlocking.concurrentSkipListMap;

/**
 * @date 2020/05/28
 * @time 15:06
 */
public class Test {

    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadA threadB = new ThreadA(myService);

        threadA.start();
        threadB.start();
    }
}
