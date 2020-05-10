package executors.threadPoolExecutor_after_before;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:18 下午
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        super();
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
        try {
            System.out.println("begin " + username + " " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("  end " + username + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
