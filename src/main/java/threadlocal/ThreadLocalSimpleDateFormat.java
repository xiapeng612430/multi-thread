package threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @date 2021/01/07
 * @time 下午3:51
 */
public class ThreadLocalSimpleDateFormat {

    public static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            final int finalI = i;
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    Date date = new Date(finalI * 1000);
                    String dateFormat = ThreadSafeSimpleDateFormat.dateFormatThreadLocal.get().format(date);
                    System.out.println(finalI + " dateFormat " + dateFormat);
                }
            });
        }
    }
}

class ThreadSafeSimpleDateFormat {

    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));

}

