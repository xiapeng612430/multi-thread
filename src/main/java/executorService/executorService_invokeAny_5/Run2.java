package executorService.executorService_invokeAny_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:44 下午
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList<>();
            callables.add(new MyCallableB());

            ExecutorService executorService = Executors.newCachedThreadPool();
            String getValue = (String) executorService.invokeAny(callables, 1, TimeUnit.SECONDS);
            System.out.println(">>>>>>>");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main catch interrupted exception");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("main catch execution exception");
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("main catch timeout exception");
        }
    }
}
