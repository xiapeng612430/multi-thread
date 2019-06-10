package lock.ConditionTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:08
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA p = new ThreadA(service);
        p.start();
        ThreadB c = new ThreadB(service);
        c.start();
    }

}
