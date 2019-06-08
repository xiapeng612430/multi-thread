package synchronizedAndVolatile.synchronized_.setNewPropertiesLockOne;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:53
 */
public class Service {

    public void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName);
                userInfo.setPassword("asdas");
                Thread.sleep(3000);
                System.out.println(threadName + " end time = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
