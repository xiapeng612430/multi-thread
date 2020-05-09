package executors.threadPoolExecutor_5;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:35 下午
 */
public class MyRunnableB implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
