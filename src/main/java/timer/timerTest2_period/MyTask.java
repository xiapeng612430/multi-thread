package timer.timerTest2_period;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:21
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("task run ,timer : " + new Date());
    }
}
