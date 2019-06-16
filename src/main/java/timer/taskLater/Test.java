package timer.taskLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 18:06
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("now:" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        Date runDate1 = calendarRef1.getTime();
        System.out.println("task1 schedule time : " + runDate1);

        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 10);
        Date runDate2 = calendarRef2.getTime();
        System.out.println("task2 schedule time : " + runDate2);

        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
