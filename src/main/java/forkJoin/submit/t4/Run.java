package forkJoin.submit.t4;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:38 下午
 */
public class Run {

    public static void main(String[] args) {
        try {
            UserInfo userInfo = new UserInfo();
            MyRunnable myRunnable = new MyRunnable(userInfo);
            ForkJoinPool forkJoinPool = new ForkJoinPool();
            forkJoinPool.submit(myRunnable, userInfo);
            System.out.println("userInfo username = " + userInfo.getUsername());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
