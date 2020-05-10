package executors.runnable_asynchronized_test;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 7:24 下午
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(username);
    }
}
