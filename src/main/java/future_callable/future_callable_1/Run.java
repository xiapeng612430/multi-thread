package future_callable.future_callable_1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 9:16 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable(100);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

            Future<String> future = threadPoolExecutor.submit(myCallable);

            System.out.println("main A " + System.currentTimeMillis());
            System.out.println(future.get());
            System.out.println("main B " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
