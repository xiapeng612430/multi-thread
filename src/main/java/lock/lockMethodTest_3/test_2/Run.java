package lock.lockMethodTest_3.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-15 21:46
 */
public class Run {

    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
