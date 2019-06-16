package timer.TimerTaskCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:50
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("now      timer : " + new Date());
        Calendar calendarRef = Calendar.getInstance();
        Date runDate1 = calendarRef.getTime();
        System.out.println("schedule timer : " + new Date());

        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1,runDate1,4000);
        timer.schedule(task2,runDate1,4000);
    }
}
