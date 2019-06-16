package timer.timerTest1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:41
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println("now : " + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 10);
        Date runDate = calendarRef.getTime();
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate);
    }
}
