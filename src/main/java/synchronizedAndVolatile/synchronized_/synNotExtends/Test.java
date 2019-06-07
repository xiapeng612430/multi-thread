package synchronizedAndVolatile.synchronized_.synNotExtends;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:47
 */
public class Test {

    public static void main(String[] args) {
        Sub sub = new Sub();
        MyThreadA a = new MyThreadA(sub);
        a.setName("a");
        a.start();
        MyThreadB b = new MyThreadB(sub);
        b.setName("b");
        b.start();
    }
}
