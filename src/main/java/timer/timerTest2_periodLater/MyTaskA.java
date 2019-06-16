package timer.timerTest2_periodLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:37
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        try {
            System.out.println("A begin timer = " + new Date());
            Thread.sleep(5000);
            System.out.println("A end   timer = " + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
