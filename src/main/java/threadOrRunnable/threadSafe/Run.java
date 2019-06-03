package threadOrRunnable.threadSafe;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:03
 */
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
