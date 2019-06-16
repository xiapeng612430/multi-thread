package timer.timerTest5;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 21:42
 */
public class Test2 {

    static class MyTask extends TimerTask {

        @Override
        public void run() {
            try {
                System.out.println("begin timer = " + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end   timer = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test1.MyTask task = new test1.MyTask();
        System.out.println("now   timer = " + System.currentTimeMillis());
        Timer timer = new Timer();
        timer.schedule(task, 3000, 4000);
    }
}
