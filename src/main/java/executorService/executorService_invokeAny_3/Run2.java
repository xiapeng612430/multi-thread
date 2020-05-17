package executorService.executorService_invokeAny_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/17 1:07 下午
 */
public class Run2 {

    public static void main(String[] args) {
        try {
            List callables = new ArrayList<>();
            callables.add(new MyCallableC());
            callables.add(new MyCallableB());

            ExecutorService executorService = Executors.newCachedThreadPool();

            String getString = (String) executorService.invokeAny(callables);
            System.out.println("getString >>>>" + getString);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main interrupted exception");
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println("main execution exception");
        }

    }
}
