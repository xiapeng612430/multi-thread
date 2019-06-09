package Inter_threadCommunication.join.joinException;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:04
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在 run end 打印");
        } catch (InterruptedException e) {
            System.out.println("线程B在 catch 打印");
            e.printStackTrace();
        }
    }
}
