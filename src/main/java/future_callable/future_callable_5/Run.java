package future_callable.future_callable_5;

import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:44 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyCallable myCallable = new MyCallable();
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

            Future<String> future = threadPoolExecutor.submit(myCallable);
            Thread.sleep(3000);
            System.out.println(future.cancel(true) + " " + future.isCancelled());
            //System.out.println(future.cancel(false) + " " + future.isCancelled());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
