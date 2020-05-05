package cyclicBarrier.cyclicBarrier_run4;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:14 上午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");

        ThreadA threadB = new ThreadA(myService);
        threadB.setName("B");

        ThreadA threadC = new ThreadA(myService);
        threadC.setName("C");

        threadA.start();
        threadB.start();
        threadC.start();
        Thread.sleep(2000);
        System.out.println("屏障对象的parties个数：" + myService.cyclicBarrier.getParties());
        System.out.println("在屏障处等待的线程个数：" + myService.cyclicBarrier.getNumberWaiting());
    }
}
