package timer.timerTest2_period;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:28
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("now     timer : " + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
        Date runDate = calendarRef.getTime();
        System.out.println("schedule time : " + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 4000);
    }
}
