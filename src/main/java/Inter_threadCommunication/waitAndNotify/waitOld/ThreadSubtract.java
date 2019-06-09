package Inter_threadCommunication.waitAndNotify.waitOld;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 11:00
 */
public class ThreadSubtract extends Thread {

    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        super();
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
