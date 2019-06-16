package timer.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:56
 */
public class Test2 {

    public static void main(String[] args) {
        System.out.println("now : " + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        calendarRef1.add(Calendar.SECOND, 10);
        Date runDate1 = calendarRef1.getTime();
        System.out.println("schedule time 1 : " + runDate1);

        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 15);
        Date runDate2 = calendarRef2.getTime();
        System.out.println("schedule time 2 : " + runDate2);

        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();

        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
