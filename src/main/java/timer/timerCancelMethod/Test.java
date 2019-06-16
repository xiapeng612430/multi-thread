package timer.timerCancelMethod;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 20:14
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("now timer = " + new Date());
        Calendar calendarRef = Calendar.getInstance();
        Date runDate = calendarRef.getTime();
        System.out.println("schedule timer : " + runDate);
        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1, runDate, 2000);
        timer.schedule(task2, runDate, 2000);
        Thread.sleep(10000);
        timer.cancel();
    }
}
