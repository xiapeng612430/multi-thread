package Inter_threadCommunication.waitAndNotify.waitOld;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 10:59
 */
public class ThreadAdd extends Thread {

    private Add add;

    public ThreadAdd(Add add) {
        super();
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
