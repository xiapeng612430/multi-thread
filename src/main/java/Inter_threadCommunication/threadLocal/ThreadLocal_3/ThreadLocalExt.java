package Inter_threadCommunication.threadLocal.ThreadLocal_3;

import java.util.Date;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 00:18
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
