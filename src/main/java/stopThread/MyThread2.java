package stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 11:55
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (interrupted()) {
                    System.out.println("已经是停止状态了！我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i= " + (i + 1));
            }
            System.out.println("under for ");
        } catch (InterruptedException e) {
            System.out.println("enter myThread2 catch");
            e.printStackTrace();
        }

    }

}
