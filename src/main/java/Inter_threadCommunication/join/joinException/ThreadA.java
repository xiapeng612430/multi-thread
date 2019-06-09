package Inter_threadCommunication.join.joinException;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:02
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
