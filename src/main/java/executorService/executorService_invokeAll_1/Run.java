package executorService.executorService_invokeAll_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:59 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList();

            callables.add(new MyCallableA());
            callables.add(new MyCallableB());

            ExecutorService executorService = Executors.newCachedThreadPool();
            System.out.println("invokeAll begin " + System.currentTimeMillis());
            List<Future<String>> listFuture = executorService.invokeAll(callables);
            System.out.println("invokeAll   end " + System.currentTimeMillis());

            for (Future<String> future : listFuture) {
                System.out.println("result = " + future.get() + " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("catch interrupted exception");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("catch execution exception");

        }
    }
}
