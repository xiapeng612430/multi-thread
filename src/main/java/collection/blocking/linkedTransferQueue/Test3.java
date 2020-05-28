package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:35 下午
 */
public class Test3 {

    public static void main(String[] args) {
        try {
            MyService myService  = new MyService();
            ThreadA threadA = new ThreadA(myService);
            threadA.setName("A");
            ThreadC threadC = new ThreadC(myService);
            threadC.setName("C");

            threadA.start();
            Thread.sleep(4000);
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
