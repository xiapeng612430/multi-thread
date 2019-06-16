package timer.TimerTaskCancelMethod;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:49
 */
public class MyTaskA extends TimerTask {

    @Override
    public void run() {
        System.out.println("A begin timer = " + new Date());
        this.cancel();
        System.out.println("A end   timer = " + new Date());
    }
}
