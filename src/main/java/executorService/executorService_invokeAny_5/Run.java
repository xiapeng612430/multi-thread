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
 * on 2020/5/17 6:15 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList();
            callables.add(new MyCallableA());

            ExecutorService executorService = Executors.newCachedThreadPool();

            String getValue = (String) executorService.invokeAny(callables, 1, TimeUnit.SECONDS);
            System.out.println("get value " + getValue);

            System.out.println(">>>>>>>>");
        } catch (InterruptedException e) {
            System.out.println("catch interrupted exception");
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("catch execution exception");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("catch timeout exception");
            e.printStackTrace();
        }
    }
}
