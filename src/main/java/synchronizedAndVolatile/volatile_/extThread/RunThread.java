package synchronizedAndVolatile.volatile_.extThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 21:22
 */
public class RunThread extends Thread {

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println(" enter run method");
        while (isRunning == true) {
        }
        System.out.println(" thread stopped");
    }
}
