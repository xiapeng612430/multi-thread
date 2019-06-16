package timer.timerTest4;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 20:38
 */
public class Run {

    static public class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("running ,timer = " + new Date());
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("now          timer = " + new Date());
        timer.schedule(task, 3000,5000);
    }
}
