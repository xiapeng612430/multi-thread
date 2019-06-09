package Inter_threadCommunication.threadLocal.InheritableThreadLocal2;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 00:28
 */
public class Run {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("in main thread get value = " + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
