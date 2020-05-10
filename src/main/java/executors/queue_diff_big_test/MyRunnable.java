package executors.queue_diff_big_test;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 11:34 上午
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("begin " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
