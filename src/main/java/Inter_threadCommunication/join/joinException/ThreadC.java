package Inter_threadCommunication.join.joinException;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:06
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
