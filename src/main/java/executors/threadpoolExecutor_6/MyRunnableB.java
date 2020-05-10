package executors.threadpoolExecutor_6;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:09 上午
 */
public class MyRunnableB implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        String adc = null;
        adc.indexOf(0);
        System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
    }
}
