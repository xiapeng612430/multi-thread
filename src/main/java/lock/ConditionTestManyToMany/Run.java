package lock.ConditionTestManyToMany;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:08
 */
public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA[] pArray = new ThreadA[100];
        ThreadB[] cArray = new ThreadB[100];
        for (int i = 0; i < 100; i++) {
            pArray[i] = new ThreadA(service);
            cArray[i] = new ThreadB(service);
            pArray[i].start();
            cArray[i].start();
        }
    }

}
