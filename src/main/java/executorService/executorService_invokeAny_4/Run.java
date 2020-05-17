package executorService.executorService_invokeAny_4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 6:05 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList();
            callables.add(new MyCallableA());
            callables.add(new MyCallableB());

            ExecutorService executorService = Executors.newCachedThreadPool();

            String getValue = (String) executorService.invokeAny(callables);
            System.out.println("get value: " + getValue);
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
