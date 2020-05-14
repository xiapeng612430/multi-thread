package future_callable.future_callable_7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:13 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable("1");
            ExecutorService executorService = Executors.newCachedThreadPool();
            Future<String> future = executorService.submit(myCallable);
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
