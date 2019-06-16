package timer.timerCancelError;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 20:32
 */
public class Test {

    public static void main(String[] args) {
        int i = 0;
        Calendar calendarRef = Calendar.getInstance();
        Date runDate = calendarRef.getTime();
        while (true) {
            i++;
            Timer timer = new Timer();
            MyTaskA task = new MyTaskA(i);
            timer.schedule(task, runDate);
            task.cancel();
        }
    }
}
