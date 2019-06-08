package synchronizedAndVolatile.synchronized_.stringAndSyn2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:41
 */
public class Service {

    public static void print(Object object) {
        try {
            synchronized (object) {
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
