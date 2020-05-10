package future_callable.future_callable_3;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:09 下午
 */
public class MyRunnable implements Runnable {

    private UserInfo userInfo;

    public MyRunnable(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        userInfo.setUsername("usernameValue");
        userInfo.setPassword("passwordValue");
    }
}
