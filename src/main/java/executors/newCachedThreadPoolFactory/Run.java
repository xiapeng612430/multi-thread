package executors.newCachedThreadPoolFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 7:17 下午
 */
public class Run {

    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newCachedThreadPool(myThreadFactory);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("我在运行" + System.currentTimeMillis() + " " + Thread.currentThread().getName());
            }
        });
    }
}
