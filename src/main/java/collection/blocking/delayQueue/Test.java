package collection.blocking.delayQueue;

import java.util.concurrent.DelayQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:02 下午
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<UserInfo> delayQueue = new DelayQueue<>();
        delayQueue.add(new UserInfo(7, "userInfo1"));
        delayQueue.add(new UserInfo(6, "userInfo2"));
        delayQueue.add(new UserInfo(5, "userInfo3"));
        delayQueue.add(new UserInfo(4, "userInfo4"));
        delayQueue.add(new UserInfo(3, "userInfo5"));

        System.out.println("          " + System.currentTimeMillis());

        System.out.println(delayQueue.take().getUsername() + " " + System.currentTimeMillis());
        System.out.println(delayQueue.take().getUsername() + " " + System.currentTimeMillis());
        System.out.println(delayQueue.take().getUsername() + " " + System.currentTimeMillis());
        System.out.println(delayQueue.take().getUsername() + " " + System.currentTimeMillis());
        System.out.println(delayQueue.take().getUsername() + " " + System.currentTimeMillis());
    }
}
