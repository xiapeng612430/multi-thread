package future_callable.future_callable_6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:02 下午
 */
public class Run1 {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable();

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

            System.out.println("begin " + System.currentTimeMillis());
            Future<String> future = threadPoolExecutor.submit(myCallable);

            System.out.println(future.get(5, TimeUnit.SECONDS));
            System.out.println("  end " + System.currentTimeMillis());


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

    }
}
