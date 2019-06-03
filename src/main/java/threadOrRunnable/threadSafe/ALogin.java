package threadOrRunnable.threadSafe;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:01
 */
public class ALogin extends Thread {

    @Override
    public void run() {
    LoginServlet.doPost("a","aa");
    }
}
