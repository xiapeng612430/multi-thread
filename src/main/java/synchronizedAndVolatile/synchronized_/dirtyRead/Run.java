package synchronizedAndVolatile.synchronized_.dirtyRead;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:38
 */
public class Run {

    public static void main(String[] args) {

        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getVaule();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
