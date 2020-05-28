package collection.nonBlocking.copyOnWriteArrayList;

/**
 * @date 2020/05/28
 * @time 17:40
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadA[] threads = new ThreadA[100];
            for (int i = 0; i < 100; i++) {
                threads[i] = new ThreadA(myService);
            }

            for (int i = 0; i < 100; i++) {
                threads[i].start();
            }

            Thread.sleep(3000);
            System.out.println(myService.copyOnWriteArrayList.size());
            System.out.println("value: " + myService.copyOnWriteArrayList.get(5));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
