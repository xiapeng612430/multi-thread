package forkJoin.shutdownNow;

/**
 * @date 2020/05/26
 * @time 10:41
 */
public class MyRunnableB implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("任务完成");
    }
}
