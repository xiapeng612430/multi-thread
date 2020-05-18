package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_4;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 11:00 下午
 */
public class MyRunnableA implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("MyRunnableA begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("MyRunnableA   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
