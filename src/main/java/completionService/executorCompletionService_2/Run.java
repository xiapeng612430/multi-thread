package completionService.executorCompletionService_2;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:27 下午
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletionService completionService = new ExecutorCompletionService(executorService);

        for (int i = 0; i < 1; i++) {
            completionService.submit(new Callable() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(3000);
                    System.out.println("3s......");
                    return "3333";
                }
            });
        }

        for (int j = 0; j < 1; j++) {
            System.out.println(completionService.poll());
        }
    }
}
