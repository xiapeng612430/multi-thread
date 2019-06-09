package Inter_threadCommunication.threadLocal.ThreadLocal_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 00:13
 */
public class Run {

    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("never set value");
            t1.set("my value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
