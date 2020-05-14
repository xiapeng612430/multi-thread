package future_callable.future_last;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:58 下午
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyCallable myCallable1 = new MyCallable("A", 5000);
            MyCallable myCallable2 = new MyCallable("B", 4000);
            MyCallable myCallable3 = new MyCallable("C", 3000);
            MyCallable myCallable4 = new MyCallable("D", 2000);
            MyCallable myCallable5 = new MyCallable("E", 1000);

            List<Callable> callables = new ArrayList<>();
            callables.add(myCallable1);
            callables.add(myCallable2);
            callables.add(myCallable3);
            callables.add(myCallable4);
            callables.add(myCallable5);

            List<Future> futures = new ArrayList<>();

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

            for (int i = 0; i < 5; i++) {
                futures.add(threadPoolExecutor.submit(callables.get(i)));
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(futures.get(i).get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
