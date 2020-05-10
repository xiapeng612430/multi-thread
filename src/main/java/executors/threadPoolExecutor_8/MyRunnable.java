package executors.threadPoolExecutor_8;


/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:40 上午
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());

        System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
    }
}
