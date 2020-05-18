package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_1;

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
 * on 2020/5/18 10:07 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List<Callable> callables = new ArrayList<>();
            callables.add(new MyCallableA());
            callables.add(new MyCallableB());

            ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

            ScheduledFuture<String> futureA = scheduledExecutorService.schedule(callables.get(0), 4, TimeUnit.SECONDS);
            ScheduledFuture<String> futureB = scheduledExecutorService.schedule(callables.get(1), 4, TimeUnit.SECONDS);

            System.out.println(">>>>>>>>> " + System.currentTimeMillis());
            System.out.println("return a : " + futureA.get());
            System.out.println("return b : " + futureB.get());
            System.out.println(">>>>>>>>> " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
