package future_callable.rejectedExecutionHandlerTest;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:20 下午
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        this.username = username;
    }


    @Override
    public void run() {
        System.out.println(username + " 被执行");
    }
}
