package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xianpeng.xia
 * on 2020/12/24 上午1:43
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executorService.execute(new Task());
        }

    }
}
