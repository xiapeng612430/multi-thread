package Inter_threadCommunication.join.joinTest1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 22:51
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
