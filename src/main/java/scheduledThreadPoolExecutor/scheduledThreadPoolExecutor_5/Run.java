package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 11:20 下午
 */
public class Run {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        System.out.println(">>>>>>>>> " + System.currentTimeMillis());
        scheduledExecutorService.scheduleWithFixedDelay(new MyRunnableA(), 1, 2, TimeUnit.SECONDS);
        System.out.println(">>>>>>>>> " + System.currentTimeMillis());
    }
}
