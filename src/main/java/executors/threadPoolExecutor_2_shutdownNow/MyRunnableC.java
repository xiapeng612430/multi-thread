package executors.threadPoolExecutor_2_shutdownNow;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:39 下午
 */
public class MyRunnableC implements Runnable {

    private String username;

    public MyRunnableC(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE / 1000; i++) {
            String newString = new String();

            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();

        }
        System.out.println("任务成功完成");
    }
}
