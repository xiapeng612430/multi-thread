package forkJoin.submit.t4;

/**
 * Created by xianpeng.xia
 * on 2020/5/25 11:36 下午
 */
public class MyRunnable implements Runnable {

    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        try {
            userInfo.setUsername("set username");
            System.out.println("end set");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
