package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_9;

/**
 * Created by xianpeng.xia
 * on 2020/5/23 10:44 上午
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
        try {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                System.out.println("running  -> " + username + " " + Thread.currentThread().getName());

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
