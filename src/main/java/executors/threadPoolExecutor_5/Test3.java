package executors.threadPoolExecutor_5;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 11:35 下午
 */
public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableB myRunnableB = new MyRunnableB();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 99999, 99999, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(myRunnableB);
        threadPoolExecutor.execute(myRunnableB);
        threadPoolExecutor.execute(myRunnableB);
        threadPoolExecutor.execute(myRunnableB);

        threadPoolExecutor.shutdown();

        System.out.println("A = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());
        System.out.println("B = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());
        System.out.println("C = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());
        System.out.println("D = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());
        System.out.println("E = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());
        System.out.println("F = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());
        System.out.println("G = "+threadPoolExecutor.awaitTermination(1,TimeUnit.SECONDS)+ " "+System.currentTimeMillis());

    }
}
