package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_8;

/**
 * Created by xianpeng.xia
 * on 2020/5/20 8:03 上午
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println("run ... " + username + " " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
    }
}
