package atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.IntStream;

/**
 * @author xianpeng.xia
 * on 2021/1/10 下午10:18
 */
public class LongAccumulatorRun {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        LongAccumulator longAccumulator = new LongAccumulator((x, y) -> x + y, 0);

        IntStream.range(1, 10).forEach(i -> executorService.submit(() -> longAccumulator.accumulate(i)));

        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        System.out.println(longAccumulator.getThenReset());

    }
}
