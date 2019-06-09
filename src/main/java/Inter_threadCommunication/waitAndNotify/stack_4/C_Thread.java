package Inter_threadCommunication.waitAndNotify.stack_4;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 19:27
 */
public class C_Thread extends Thread {

    private C c;

    public C_Thread(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popStack();
        }
    }
}
