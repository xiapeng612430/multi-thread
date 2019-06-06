package stopThread;

/**
 * Created by xianpeng.xia
 * on 2019-06-06 13:18
 */
public class MyThread4 extends Thread {

    private int i = 0;

    @Override
    public void run() {
        super.run();

        try {
            while (true) {
                i++;
                System.out.println("i= " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

