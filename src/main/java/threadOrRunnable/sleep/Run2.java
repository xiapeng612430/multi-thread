package threadOrRunnable.sleep;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 10:22
 */
public class Run2 {

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
