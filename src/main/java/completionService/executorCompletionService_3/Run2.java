package completionService.executorCompletionService_3;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:31 下午
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            MyCallableA myCallableA = new MyCallableA();
            MyCallableB myCallableB = new MyCallableB();

            Executor executor = Executors.newCachedThreadPool();
            CompletionService completionService = new ExecutorCompletionService(executor);

            completionService.submit(myCallableA);
            completionService.submit(myCallableB);

            for (int i = 0; i < 2; i++) {
                System.out.println(">>>>> " + completionService.poll(6, TimeUnit.SECONDS));
                System.out.println("xxxx");
            }
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
