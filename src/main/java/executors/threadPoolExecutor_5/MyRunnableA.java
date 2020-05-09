package executors.threadPoolExecutor_5;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:27 下午
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
