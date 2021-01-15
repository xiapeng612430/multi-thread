package cache;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @date 2021/01/15
 * @time 15:46
 * <p>
 * 耗时计算的实现类
 */
public class ExpensiveFunction implements Computable<String, Integer> {

    @Override
    public Integer compute(String arg) throws Exception {
        TimeUnit.SECONDS.sleep(2);
        //System.out.println(System.currentTimeMillis() + "  " + Thread.currentThread().getName() + " arg " + arg);
        if (Math.random() > 0.5) {
            throw new IOException("计算失败");
        }
        return Integer.valueOf(arg);
    }
}
