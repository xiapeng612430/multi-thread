package timer.timerTest5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import timer.timerTest5.Test5.MyTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 22:07
 */
public class Test9 {

    static class NyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("begin timer = " + new Date());
            System.out.println("end   timer = " + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        System.out.println("now   timer = " + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 20);
        Date runDate = calendarRef.getTime();
        System.out.println("schedule timer = " + new Date());
        Timer timer = new Timer();
        timer.schedule(task, runDate, 2000);
    }
}
