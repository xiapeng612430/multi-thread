package forkJoin.submit.t4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:42 下午
 */
public class Run3 {

    public static void main(String[] args) {
        try {
            UserInfo userInfo = new UserInfo();
            MyRunnable myRunnable = new MyRunnable(userInfo);
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            ForkJoinTask<UserInfo> future = forkJoinPool.submit(myRunnable, userInfo);
            System.out.println(future);
            System.out.println("userInfo username =  " + future.get().getUsername());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
