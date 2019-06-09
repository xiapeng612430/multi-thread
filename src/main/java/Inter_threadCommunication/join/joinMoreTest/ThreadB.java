package Inter_threadCommunication.join.joinMoreTest;


import Inter_threadCommunication.waitAndNotify.p_c_allWait.ThreadC;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:37
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        try {
            System.out.println("begin B ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
