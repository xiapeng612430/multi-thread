package executors.get_diff;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 7:02 下午
 */
public class GetCorePoolSizeTest {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        System.out.println(threadPoolExecutor.getCorePoolSize());
    }
}
