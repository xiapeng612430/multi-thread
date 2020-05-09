package executors.threadPoolExecutor_2_shutdownNow;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:39 下午
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
                Math.random();

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("任务还没完成，就中断了");
                    throw new InterruptedException();
                }

            }
        } catch (InterruptedException e) {
            System.out.println("进入了catch 中断了任务");
            e.printStackTrace();
        }
    }
}
