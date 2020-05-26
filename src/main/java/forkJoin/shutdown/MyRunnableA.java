package forkJoin.shutdown;

/**
 * @date 2020/05/26
 * @time 09:41
 */
public class MyRunnableA implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + "   end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
