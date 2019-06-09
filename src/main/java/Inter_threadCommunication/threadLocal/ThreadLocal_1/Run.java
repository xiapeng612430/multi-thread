package Inter_threadCommunication.threadLocal.ThreadLocal_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:54
 */
public class Run {

    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从没放过值");
            t1.set("my value");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
