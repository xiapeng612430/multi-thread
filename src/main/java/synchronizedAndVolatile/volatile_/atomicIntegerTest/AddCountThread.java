package synchronizedAndVolatile.volatile_.atomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:07
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
