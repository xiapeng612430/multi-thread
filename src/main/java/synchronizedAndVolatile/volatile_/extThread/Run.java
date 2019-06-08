package synchronizedAndVolatile.volatile_.extThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 21:23
 */
public class Run {

    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("has set false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
