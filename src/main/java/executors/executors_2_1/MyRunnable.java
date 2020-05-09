package executors.executors_2_1;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 6:10 下午
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " username = " + username + " begin " + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + " username = " + username + "   end " + System.currentTimeMillis());

    }
}
