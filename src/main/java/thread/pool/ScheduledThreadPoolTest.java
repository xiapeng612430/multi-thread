package thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author xianpeng.xia
 * on 2020/12/24 上午1:50
 */
public class ScheduledThreadPoolTest {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        // scheduledExecutorService.schedule(new Task(), 5, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new Task(), 1, 5, TimeUnit.SECONDS);
    }
}
