package executors.exeuctors_4;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 7:48 下午
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " username = " + username + " begin " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " username = " + username + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
