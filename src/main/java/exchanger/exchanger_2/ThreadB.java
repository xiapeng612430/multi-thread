package exchanger.exchanger_2;

import java.util.concurrent.Exchanger;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:40
 */
public class ThreadB extends Thread {

    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("thread B get value from thread A is : " + exchanger.exchange("person b"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
