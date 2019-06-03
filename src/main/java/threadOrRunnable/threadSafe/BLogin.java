package threadOrRunnable.threadSafe;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:03
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
