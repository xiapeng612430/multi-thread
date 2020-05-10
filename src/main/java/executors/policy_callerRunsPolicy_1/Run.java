package executors.policy_callerRunsPolicy_1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 2:16 下午
 */
public class Run {

    public static void main(String[] args) {
        MyThreadA myThreadA = new MyThreadA();

        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<>(2);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linkedBlockingDeque);
        System.out.println("a begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

        threadPoolExecutor.execute(myThreadA);
        threadPoolExecutor.execute(myThreadA);
        threadPoolExecutor.execute(myThreadA);
        threadPoolExecutor.execute(myThreadA);
        threadPoolExecutor.execute(myThreadA);
        threadPoolExecutor.execute(myThreadA);

        System.out.println("a   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

    }
}
