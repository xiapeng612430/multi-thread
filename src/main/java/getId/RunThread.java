package getId;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 10:36
 */
public class RunThread {

    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
