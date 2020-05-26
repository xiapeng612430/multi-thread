package forkJoin.shutdownNow;

/**
 * @date 2020/05/26
 * @time 10:34
 */
public class MyRunnableA implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                Math.random();
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("任务未完成被中断了");
                    throw new InterruptedException();
                }
            }
            System.out.println("任务完成");
        } catch (InterruptedException e) {
            System.out.println("catch exception , interrupted task");
            e.printStackTrace();
        }
    }
}
