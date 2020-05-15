package completionService.executorCompletionService_errorHandle;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:59 下午
 */
public class Run4 {

    public static void main(String[] args) {
        try {
            MyCallableA myCallableA = new MyCallableA();
            MyCallableB myCallableB = new MyCallableB();

            ExecutorService executor = Executors.newCachedThreadPool();
            CompletionService completionService = new ExecutorCompletionService(executor);

            completionService.submit(myCallableB);
            completionService.submit(myCallableA);

            for (int i = 0; i < 2; i++) {
                System.out.println(">>>>>>>>> " + completionService.poll());
            }

            Thread.sleep(6000);
            System.out.println("A>>>>>>>>> " + completionService.poll());
            System.out.println("B>>>>>>>>> " + completionService.poll());

            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
