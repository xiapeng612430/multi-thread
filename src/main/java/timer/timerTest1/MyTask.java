package timer.timerTest1;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:40
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("run task ,timer = " + new Date());
    }
}
