package threadOrRunnable.currentThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 08:28
 */
public class Run {

    public static void main(String[] args) {
        Thread countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();
    }
}
