package future_callable.future_callable_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:11 下午
 */
public class Test {

    FutureTask futureTask;

    public static void main(String[] args) {
        try {
            UserInfo userInfo = new UserInfo();
            MyRunnable myRunnable = new MyRunnable(userInfo);

            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

            Future<UserInfo> future = threadPoolExecutor.submit(myRunnable, userInfo);
            System.out.println("begin time = " + System.currentTimeMillis());
            userInfo = future.get();
            System.out.println("get value: " + userInfo.getUsername() + " " + userInfo.getPassword());
            System.out.println("  end time =  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
