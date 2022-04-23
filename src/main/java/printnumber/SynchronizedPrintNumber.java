package printnumber;

/**
 * @author xianpeng.xia
 * on 2022/4/23 7:42 PM
 * 三个线程交替打印 1 - 100
 */
public class SynchronizedPrintNumber extends Thread {

    static int cnt = 0;
    /**
     * 余数
     */
    private int remainder;

    public SynchronizedPrintNumber(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (cnt < 100) {
            // 取余
            if (cnt % 3 == remainder) {
                synchronized (SynchronizedPrintNumber.class) {
                    cnt++;
                    System.out.println(Thread.currentThread().getName() + " " + cnt);
                }
            }
        }
    }


    public static void main(String[] args) {
        Thread t1 = new SynchronizedPrintNumber(0);
        Thread t2 = new SynchronizedPrintNumber(1);
        Thread t3 = new SynchronizedPrintNumber(2);
        t1.start();
        t2.start();
        t3.start();
    }
}
