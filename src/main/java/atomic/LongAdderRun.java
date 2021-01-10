package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author xianpeng.xia
 * on 2021/1/10 下午9:24
 */
public class LongAdderRun {

    public static void main(String[] args) {
        LongAdder counter = new LongAdder();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            executorService.submit(new Task(counter));
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        long end = System.currentTimeMillis();
        System.out.println(counter.intValue());
        System.out.println("cost: " + (end - start));
    }

    private static class Task implements Runnable {

        private LongAdder counter;

        public Task(LongAdder counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        }
    }
}
