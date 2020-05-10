package executors.get_diff;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 6:42 下午
 */
public class MyThreadA extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
