package collection.nonBlocking.concurrentHashMap;

/**
 * @date 2020/05/28
 * @time 09:56
 */
public class Test {

    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        ThreadB threadB = new ThreadB(myService);
        ThreadC threadC = new ThreadC(myService);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
