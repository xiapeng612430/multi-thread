package completionService.executorCompletionService_3;

import java.util.concurrent.CompletionService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:31 下午
 */
public class Run {

    public static void main(String[] args) {
        MyCallableA myCallableA = new MyCallableA();
        MyCallableB myCallableB = new MyCallableB();

        Executor executor = Executors.newCachedThreadPool();
        CompletionService completionService = new ExecutorCompletionService(executor);

        completionService.submit(myCallableA);
        completionService.submit(myCallableB);

        for (int i = 0; i < 2; i++) {
            System.out.println(">>>>> " + completionService.poll());
        }
        System.out.println("main end");
    }
}
