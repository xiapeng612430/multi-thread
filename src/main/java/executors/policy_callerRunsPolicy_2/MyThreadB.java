package executors.policy_callerRunsPolicy_2;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 2:55 下午
 */
public class MyThreadB extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(" end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
