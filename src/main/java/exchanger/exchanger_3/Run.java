package exchanger.exchanger_3;

import java.util.concurrent.Exchanger;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:57
 */
public class Run {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ThreadA a = new ThreadA(exchanger);
        a.start();
        System.out.println("main end");
    }
}
