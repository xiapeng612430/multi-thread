package completionService.executorCompletionService_4;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 11:27 下午
 */
public class MyRunable implements Runnable {

    private UserInfo userInfo;

    public MyRunable(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        userInfo.setUsername("usernameValue");
        userInfo.setPassword("passwordValue");
        System.out.println("run .... ");
    }
}
