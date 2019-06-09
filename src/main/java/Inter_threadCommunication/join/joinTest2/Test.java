package Inter_threadCommunication.join.joinTest2;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 22:53
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("我想等 threadTest 执行完执行 ,我做到了 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
