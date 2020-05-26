package forkJoin.invokeAll.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * @date 2020/05/26
 * @time 09:30
 */
public class Test {

    public static void main(String[] args) {
        try {
            List list = new ArrayList<>();
            list.add(new MyCallable(5000));
            list.add(new MyCallable(4000));
            list.add(new MyCallable(3000));
            list.add(new MyCallable(2000));
            list.add(new MyCallable(1000));

            ForkJoinPool forkJoinPool = new ForkJoinPool();
            List<Future<String>> listFuture = forkJoinPool.invokeAll(list);
            for (int i = 0; i < listFuture.size(); i++) {
                System.out.println(listFuture.get(i).get() + " now time " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
