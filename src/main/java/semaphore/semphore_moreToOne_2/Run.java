package semaphore.semphore_moreToOne_2;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 01:06
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < 12; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].setName("Thread->" + (i + 1));
            threadArray[i].start();
        }
    }
}
