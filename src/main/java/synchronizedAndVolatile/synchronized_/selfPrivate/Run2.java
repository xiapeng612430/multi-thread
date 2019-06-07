package synchronizedAndVolatile.synchronized_.selfPrivate;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 15:12
 */
public class Run2 {

    public static void main(String[] args) {
        HasSelfPrivateNum num1 = new HasSelfPrivateNum();
        HasSelfPrivateNum num2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(num1);
        ThreadB threadB = new ThreadB(num2);
        threadA.start();
        threadB.start();
    }
}
