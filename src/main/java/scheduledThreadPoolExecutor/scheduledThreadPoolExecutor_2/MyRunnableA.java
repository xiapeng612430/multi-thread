package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_2;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:20 下午
 */
public class MyRunnableA implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("MyRunnableA begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("MyRunnableA   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
