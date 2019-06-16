package timer.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:50
 */
public class MyTaskB extends TimerTask {

    @Override
    public void run() {
        System.out.println("B begin timer = " + new Date());
    }
}
