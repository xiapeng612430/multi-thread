package lock.awaitUntilTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 15:47
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
