package Inter_threadCommunication.join.joinTest1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 22:53
 */
public class Test {

    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        System.out.println("我想等 threadTest 执行完执行");
        System.out.println("但 不知道 什么时候执行完");
    }
}
