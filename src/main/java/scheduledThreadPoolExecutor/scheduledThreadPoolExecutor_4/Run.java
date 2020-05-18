package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_4;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 11:01 下午
 */
public class Run {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorServie = Executors.newSingleThreadScheduledExecutor();
        System.out.println(">>>>>>>>>> " + System.currentTimeMillis());
        scheduledExecutorServie.scheduleAtFixedRate(new MyRunnableA(), 1, 2, TimeUnit.SECONDS);
        System.out.println(">>>>>>>>>> " + System.currentTimeMillis());

    }
}
