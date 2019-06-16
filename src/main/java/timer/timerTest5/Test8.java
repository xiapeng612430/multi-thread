package timer.timerTest5;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 22:05
 */
public class Test8 {
    static class MyTask extends TimerTask {

        @Override
        public void run() {
            try {
                System.out.println("begin timer = " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end   timer = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, 3000, 3000);
    }
}
