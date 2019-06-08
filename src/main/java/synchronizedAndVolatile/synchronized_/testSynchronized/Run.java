package synchronizedAndVolatile.synchronized_.testSynchronized;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 09:54
 */
public class Run {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread1 thread2 = new MyThread1(task);
        thread2.start();
    }
}
