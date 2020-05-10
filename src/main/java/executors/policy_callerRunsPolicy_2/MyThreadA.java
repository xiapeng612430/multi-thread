package executors.policy_callerRunsPolicy_2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 2:54 下午
 */
public class MyThreadA extends Thread {

    @Override
    public void run() {
        MyThreadB myThreadB = new MyThreadB();
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque<>(2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linkedBlockingDeque, new CallerRunsPolicy());

        System.out.println("a begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

        threadPoolExecutor.execute(myThreadB);
        threadPoolExecutor.execute(myThreadB);
        threadPoolExecutor.execute(myThreadB);
        threadPoolExecutor.execute(myThreadB);
        threadPoolExecutor.execute(myThreadB);
        threadPoolExecutor.execute(myThreadB);

        System.out.println("a   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

    }
}
