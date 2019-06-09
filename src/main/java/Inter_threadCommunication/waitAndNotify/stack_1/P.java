package Inter_threadCommunication.waitAndNotify.stack_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 19:23
 */
public class P {

    private MyStack stack;

    public P(MyStack stack) {
        super();
        this.stack = stack;
    }

    public void pushService() {
        stack.push();
    }
}
