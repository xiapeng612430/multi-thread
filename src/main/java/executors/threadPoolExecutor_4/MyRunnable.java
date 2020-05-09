package executors.threadPoolExecutor_4;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:20 下午
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
