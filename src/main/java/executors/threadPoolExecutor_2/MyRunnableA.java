package executors.threadPoolExecutor_2;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:24 下午
 */
public class MyRunnableA implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
