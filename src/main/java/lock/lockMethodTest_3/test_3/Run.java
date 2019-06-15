package lock.lockMethodTest_3.test_3;

/**
 * Created by xianpeng.xia
 * on 2019-06-15 22:10
 */
public class Run {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
