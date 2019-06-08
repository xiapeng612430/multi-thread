package synchronizedAndVolatile.synchronized_.syn_out_asyn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:09
 */
public class Test {

    public static void main(String[] args) {
        MyList list = new MyList();
        MyThreadA a = new MyThreadA(list);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(list);
        b.setName("B");
        b.start();
    }

}
