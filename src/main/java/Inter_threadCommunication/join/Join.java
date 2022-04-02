package Inter_threadCommunication.join;

/**
 * @author xianpeng.xia
 * on 2022/4/3 12:00 AM
 */
public class Join {

    public static void main(String[] args) {
        final Thread t1 = new Thread(() -> {
            System.out.println("t1");
        });

        final Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2");
        });

        final Thread t3 = new Thread(() -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t3");
        });

        t1.start();
        t2.start();
        t3.start();
    }

}
