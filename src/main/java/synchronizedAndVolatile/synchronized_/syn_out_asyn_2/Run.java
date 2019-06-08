package synchronizedAndVolatile.synchronized_.syn_out_asyn_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:24
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("list :" + list.toString() + " list size = " + list.getSize());
    }
}
