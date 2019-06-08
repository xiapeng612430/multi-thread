package synchronizedAndVolatile.volatile_.atomicIntegerNotSafe;


/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:24
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] myThreads = new MyThread[5];
            for (int i = 0; i < 5; i++) {
                myThreads[i] = new MyThread(service);
            }
            for (int i = 0; i < 5; i++) {
                myThreads[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.sum.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
