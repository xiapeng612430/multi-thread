package synchronizedAndVolatile.synchronized_.setNewPropertiesLockOne;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:58
 */
public class ThreadB extends Thread {

    private Service service;
    private UserInfo userInfo;

    public ThreadB(Service service, UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
