package timer.timerCancelError;

import java.util.TimerTask;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 20:31
 */
public class MyTaskA extends TimerTask {

    private int i;

    public MyTaskA(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("第 " + i + " 次没有被canccel取消");
    }
}
