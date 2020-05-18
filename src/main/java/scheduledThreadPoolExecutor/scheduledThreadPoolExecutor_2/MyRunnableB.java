package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_2;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:20 下午
 */
public class MyRunnableB implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnableB begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        System.out.println("MyRunnableB   end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

    }
}
