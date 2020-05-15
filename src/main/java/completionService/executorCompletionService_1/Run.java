package completionService.executorCompletionService_1;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 10:16 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();
            CompletionService completionService = new ExecutorCompletionService(executorService);

            for (int i = 0; i < 10; i++) {
                completionService.submit(new Callable() {
                    @Override
                    public String call() throws Exception {
                        int sleepValue = (int) (Math.random() * 1000);
                        Thread.sleep(sleepValue);
                        return "sleepValue -> " + sleepValue + " " + Thread.currentThread().getName();
                    }
                });
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(completionService.take().get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
