package Inter_threadCommunication.threadLocal.ThreadLocal_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 00:12
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "defalut";
    }
}
