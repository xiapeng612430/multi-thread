package cyclicBarrier.cyclicBarrier_run1;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:26 下午
 */
public class Test {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        MyService myService = new MyService(cyclicBarrier);

        ThreadA threadA1= new ThreadA(myService);
        threadA1.setName("A");
        threadA1.start();

        ThreadA threadA2= new ThreadA(myService);
        threadA2.setName("B");
        threadA2.start();


        ThreadA threadA3= new ThreadA(myService);
        threadA3.setName("C");
        threadA3.start();

        ThreadA threadA4= new ThreadA(myService);
        threadA4.setName("D");
        threadA4.start();
    }
}
