package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:22 下午
 */
public class Run {

    public static void main(String[] args) {
        List<Runnable> runnables = new ArrayList<>();
        runnables.add(new MyRunnableA());
        runnables.add(new MyRunnableB());

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println(">>>>>>>>>>> " + System.currentTimeMillis());
        scheduledExecutorService.schedule(runnables.get(0), 0, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(runnables.get(1), 0, TimeUnit.SECONDS);
        System.out.println(">>>>>>>>>>> " + System.currentTimeMillis());
    }
}
