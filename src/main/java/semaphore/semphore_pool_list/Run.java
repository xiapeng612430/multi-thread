package semaphore.semphore_pool_list;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 01:34
 */
public class Run {

    public static void main(String[] args) {
        ListPool listPool = new ListPool();
        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(listPool);
            threadArray[i].setName("Thread-" + (i + 1));
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
