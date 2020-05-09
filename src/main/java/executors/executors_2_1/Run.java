package executors.executors_2_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 6:11 下午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exectorSer = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            exectorSer.execute(new MyRunnable("" + (i + 1)));
        }

        Thread.sleep(1000);

        System.out.println(">>>");
        System.out.println(">>>");
        for (int i = 0; i < 5; i++) {
            exectorSer.execute(new MyRunnable("" + (i + 1)));
        }

    }
}
