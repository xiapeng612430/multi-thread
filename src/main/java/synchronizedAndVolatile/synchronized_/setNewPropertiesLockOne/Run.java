package synchronizedAndVolatile.synchronized_.setNewPropertiesLockOne;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:55
 */
public class Run {

    public static void main(String[] args) {
        try {
            UserInfo userInfo = new UserInfo("a", "aa");
            Service service = new Service();
            ThreadA a = new ThreadA(service, userInfo);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service, userInfo);
            b.setName("B");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
