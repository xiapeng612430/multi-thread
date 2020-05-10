package executors.threadPoolExecutor_7;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:24 上午
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
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
