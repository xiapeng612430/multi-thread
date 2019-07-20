package exchanger.exchanger_3;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:56
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
            System.out.println("thread B get value form thread A is : " + exchanger.exchange("person a", 5, TimeUnit.SECONDS));
            System.out.println("B end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
