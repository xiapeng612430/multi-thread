package forkJoin.invokeAll.t1;

import java.util.concurrent.Callable;

/**
 * @date 2020/05/26
 * @time 09:28
 */
public class MyCallable implements Callable<String> {

    private int sleepValue;

    public MyCallable(int sleepValue) {
        this.sleepValue = sleepValue;
    }


    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " sleep " + sleepValue + " now time : " + System.currentTimeMillis());
            Thread.sleep(sleepValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "result";
    }
}
