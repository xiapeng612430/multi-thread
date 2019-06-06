package sleep;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 09:26
 */
public class Run1 {

    public static void main(String[] args) {
        MyThred1 myThred1 = new MyThred1();
        System.out.println("begin = " + System.currentTimeMillis());
        myThred1.run();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
