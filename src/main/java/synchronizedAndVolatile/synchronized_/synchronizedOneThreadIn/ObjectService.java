package synchronizedAndVolatile.synchronized_.synchronizedOneThreadIn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 08:52
 */
public class ObjectService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end   time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
