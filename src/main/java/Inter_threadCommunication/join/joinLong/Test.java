package Inter_threadCommunication.join.joinLong;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:12
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            //threadTest.join(2000);
            Thread.sleep(2000);
            System.out.println("end   timer = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
