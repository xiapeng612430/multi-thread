package printnumber;

/**
 * @author xianpeng.xia
 * on 2022/4/23 7:54 PM
 */
public class NotifyWaitPrintNumber extends Thread {

    public static int cnt = 0;
    private int remainder;

    public NotifyWaitPrintNumber(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (cnt < 100) {
            synchronized (NotifyWaitPrintNumber.class) {
                if (cnt % 3 == remainder) {
                    cnt++;
                    System.out.println(Thread.currentThread().getName() + " " + cnt);
                } else {
                    try {
                        NotifyWaitPrintNumber.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                NotifyWaitPrintNumber.class.notifyAll();
            }
        }
    }

    public static void main(String[] args) {

        NotifyWaitPrintNumber t1 = new NotifyWaitPrintNumber(0);
        NotifyWaitPrintNumber t2 = new NotifyWaitPrintNumber(1);
        NotifyWaitPrintNumber t3 = new NotifyWaitPrintNumber(2);

        t1.start();
        t2.start();
        t3.start();
    }
}
