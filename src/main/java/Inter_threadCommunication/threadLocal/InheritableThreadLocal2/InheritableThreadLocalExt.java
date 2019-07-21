package Inter_threadCommunication.threadLocal.InheritableThreadLocal2;

import java.util.Date;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 00:25
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " ～～～";
    }
}
