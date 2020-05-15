package completionService.executorCompletionService_3;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:31 下午
 */
public class Run3 {

    public static void main(String[] args) {
        try {
            MyCallableA myCallableA = new MyCallableA();
            MyCallableB myCallableB = new MyCallableB();

            Executor executor = Executors.newCachedThreadPool();
            CompletionService<String> completionService = new ExecutorCompletionService<String>(executor);

            completionService.submit(myCallableA);
            completionService.submit(myCallableB);

            System.out.println("########" + completionService.poll(4, TimeUnit.SECONDS) + " >>> " + System.currentTimeMillis());
            System.out.println("..........");

            System.out.println("########" + completionService.poll(2, TimeUnit.SECONDS).get() + " >>> " + System.currentTimeMillis());
            System.out.println("..........");

            System.out.println("########" + completionService.poll(5, TimeUnit.SECONDS).get() + " >>> " + System.currentTimeMillis());
            System.out.println("..........");

            System.out.println("main end");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
