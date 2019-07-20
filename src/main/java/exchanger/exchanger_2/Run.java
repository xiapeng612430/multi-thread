package exchanger.exchanger_2;

import java.util.concurrent.Exchanger;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:48
 */
public class Run {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ThreadA a = new ThreadA(exchanger);
        ThreadB b = new ThreadB(exchanger);
        a.start();
        b.start();
    }
}
