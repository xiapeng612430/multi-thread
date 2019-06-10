package lock.UseConditionWaitNotifyError;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:12
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
