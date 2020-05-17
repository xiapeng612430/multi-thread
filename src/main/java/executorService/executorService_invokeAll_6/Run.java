package executorService.executorService_invokeAll_6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 10:45 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList();
            callables.add(new MyCallableA());
            callables.add(new MyCallableB());

            ExecutorService executorService = Executors.newCachedThreadPool();
            System.out.println("X --- " + System.currentTimeMillis());
            List<Future<String>> listFuture = executorService.invokeAll(callables, 1, TimeUnit.SECONDS);
            System.out.println("Y --- " + System.currentTimeMillis());
            for (int i = 0; i < listFuture.size(); i++) {
                System.out.println("the " + (i + 1) + " th ");
                System.out.println(listFuture.get(i).get());
            }
            System.out.println("Z --- " + System.currentTimeMillis());
            System.out.println("main  end --- " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("main catch interrupted exception");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("main catch execution exception");
            e.printStackTrace();
        }
    }
}
