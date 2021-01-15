package future_callable.timeout;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @date 2021/01/15
 * @time 13:51
 */
public class Timeout {

    private static final Ad DEFAULT_AD = new Ad("无网络时默认广告");
    private static final Ad EXCEPTION_AD = new Ad("无网络时默认广告");
    private static final Ad NORMAL_AD = new Ad("正常广告");
    private static final Ad TIMEOUT_DEFAULT_AD = new Ad("超时默认广告");
    private static final Ad SLEEP_DEFAULT_AD = new Ad("Sleep时候默认广告");
    private static final Ad INTERRUPTED_DEFAULT_AD = new Ad("被中断的默认广告");

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    static class Ad {

        String name;

        public Ad(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Ad{" +
                "name='" + name + '\'' +
                '}';
        }
    }

    static class FetchAdTask implements Callable<Ad> {

        @Override
        public Ad call() throws Exception {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Sleep期间被中断");
                return INTERRUPTED_DEFAULT_AD;
            }
            return NORMAL_AD;
        }
    }

    public void printAd() {
        Future<Ad> future = executorService.submit(new FetchAdTask());
        Ad ad;
        try {
            ad = future.get(2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ad = INTERRUPTED_DEFAULT_AD;
        } catch (ExecutionException e) {
            ad = EXCEPTION_AD;
        } catch (TimeoutException e) {
            ad = TIMEOUT_DEFAULT_AD;
            System.out.println("超时,未获取到广告");
            //true表示中断任务,false表示不中断任务
            boolean cancel = future.cancel(true);
            System.out.println("cancel的结果 " + cancel);
        }
        executorService.shutdown();
        System.out.println(ad);
    }

    public static void main(String[] args) {
        Timeout timeout = new Timeout();
        timeout.printAd();
    }
}
