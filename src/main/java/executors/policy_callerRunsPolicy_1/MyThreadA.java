package executors.policy_callerRunsPolicy_1;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 2:15 下午
 */
public class MyThreadA extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
