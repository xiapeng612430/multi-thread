package future_callable.future_callable_2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 9:31 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(">>>>");
                }
            };

            ExecutorService executorService = Executors.newCachedThreadPool();

            Future<?> future = executorService.submit(runnable);
            System.out.println(future.get() + " " + future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
