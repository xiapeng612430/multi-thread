package semaphore.semaphore_acquire_release;

/**
 * Created by xianpeng.xia
 * on 2019-07-08 01:30
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ThreadA(service);
            a[i].setName("Thread " + i);
            a[i].start();
        }
    }
}
