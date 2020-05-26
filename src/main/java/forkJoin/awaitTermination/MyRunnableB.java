package forkJoin.awaitTermination;

/**
 * @date 2020/05/26
 * @time 17:18
 */
public class MyRunnableB implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
