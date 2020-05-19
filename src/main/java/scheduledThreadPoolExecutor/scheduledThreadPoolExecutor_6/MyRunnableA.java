package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_6;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 11:31 下午
 */
public class MyRunnableA implements Runnable {

    private String username;

    public MyRunnableA(String username) {
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
        System.out.println("run ! username = " + username + " " + Thread.currentThread().getName());
    }
}
