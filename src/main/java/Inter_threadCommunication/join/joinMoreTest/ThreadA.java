package Inter_threadCommunication.join.joinMoreTest;


import Inter_threadCommunication.waitAndNotify.p_c_allWait.ThreadC;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 23:37
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                System.out.println("begin A ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end A ThreadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
