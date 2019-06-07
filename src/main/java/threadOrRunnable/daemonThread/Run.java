package threadOrRunnable.daemonThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 14:10
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread thread =new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象再也不打印了，即停止");
        }catch (InterruptedException e){

        }
    }
}
