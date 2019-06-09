package Inter_threadCommunication.waitAndNotify.stack_4;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 19:24
 */
public class C {

    private MyStack stack;

    public C(MyStack stack) {
        super();
        this.stack = stack;
    }

    public void popStack() {
        System.out.println("pop=" + stack.pop());
    }
}
