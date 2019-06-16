package timer.timerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 20:13
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        System.out.println("A run timer = " + new Date());
    }
}
