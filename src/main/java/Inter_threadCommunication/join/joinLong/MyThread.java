package Inter_threadCommunication.join.joinLong;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:10
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin timer = " + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
