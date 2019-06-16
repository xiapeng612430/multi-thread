package timer.timerTest2;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:52
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("task run , timer = " + new Date());
    }
}
