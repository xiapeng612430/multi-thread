package executors.get_diff;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 7:05 下午
 */
public class GetMaximumPoolSizeTest {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new SynchronousQueue<>());

        System.out.println(threadPoolExecutor.getMaximumPoolSize());
    }
}
