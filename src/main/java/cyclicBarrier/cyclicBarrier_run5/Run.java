package cyclicBarrier.cyclicBarrier_run5;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:27 上午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");
        ThreadA threadB = new ThreadA(myService);
        threadB.setName("B");

        threadA.start();
        threadB.start();
        Thread.sleep(2000);
        myService.cyclicBarrier.reset();
    }
}
