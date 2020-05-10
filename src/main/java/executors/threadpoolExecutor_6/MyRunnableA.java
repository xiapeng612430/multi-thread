package executors.threadpoolExecutor_6;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 9:56 上午
 */
public class MyRunnableA implements Runnable {

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
