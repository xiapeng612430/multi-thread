package exchanger.exchanger_2;

import java.util.concurrent.Exchanger;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:40
 */
public class ThreadA extends Thread {

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("thread A get value from thread B is : " + exchanger.exchange("person a"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
