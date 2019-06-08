package Inter_threadCommunication.twoThreadTransData;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:08
 */
public class Test {

    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}
