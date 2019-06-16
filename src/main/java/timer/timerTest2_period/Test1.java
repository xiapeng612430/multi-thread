package timer.timerTest2_period;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:21
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println("now     timer : " + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runDate = calendarRef.getTime();
        System.out.println("schedule timer : " + runDate);
        MyTask task  = new MyTask();
        Timer timer  = new Timer();
        timer.schedule(task,runDate,4000);
    }
}
