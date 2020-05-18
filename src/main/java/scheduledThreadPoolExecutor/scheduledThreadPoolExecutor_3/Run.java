package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:50 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List<Callable> callables = new ArrayList<>();
            callables.add(new MyCallable());

            ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
            System.out.println(">>>>>>>>  " + System.currentTimeMillis());
            ScheduledFuture<String> future = scheduledExecutorService.schedule(callables.get(0), 4, TimeUnit.SECONDS);
            System.out.println("get " + future.get());
            System.out.println(">>>>>>>>  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
