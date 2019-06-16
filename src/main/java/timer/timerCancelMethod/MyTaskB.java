package timer.timerCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 20:13
 */
public class MyTaskB extends TimerTask {

    @Override
    public void run() {
        System.out.println("B run timer = " + new Date());
    }
}
