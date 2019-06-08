package synchronizedAndVolatile.synchronized_.stringAndSyn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:33
 */
public class Service {

    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
