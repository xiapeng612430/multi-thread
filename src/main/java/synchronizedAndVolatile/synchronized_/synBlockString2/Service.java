package synchronizedAndVolatile.synchronized_.synBlockString2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:37
 */
public class Service {

    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a   end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b   end");
    }
}
