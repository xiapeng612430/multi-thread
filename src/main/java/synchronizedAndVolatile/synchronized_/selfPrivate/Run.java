package synchronizedAndVolatile.synchronized_.selfPrivate;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 14:45
 */
public class Run {

    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
