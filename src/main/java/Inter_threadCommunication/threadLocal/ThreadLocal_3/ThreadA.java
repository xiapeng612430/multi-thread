package Inter_threadCommunication.threadLocal.ThreadLocal_3;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 00:20
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("in thread A get value = " + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
