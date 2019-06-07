package threadOrRunnable.setPriority.extThread;

import java.util.Random;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 13:22
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("&&&&& &&&&& thread 2 use time= " + (end - start));


    }
}
