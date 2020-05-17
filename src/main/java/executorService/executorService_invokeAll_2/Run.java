package executorService.executorService_invokeAll_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 8:57 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList();
            callables.add(new MyCallableA());
            callables.add(new MyCallableB());

            ExecutorService executorService = Executors.newCachedThreadPool();
            System.out.println("begin work " + System.currentTimeMillis());
            List<Future<String>> listFuture = executorService.invokeAll(callables);
            System.out.println("  end work " + System.currentTimeMillis());

            for (Future<String> future : listFuture) {
                System.out.println("result -> " + future.get());
            }

            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main catch interrupted exception");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("main catch execution exception");
        }
    }
}
