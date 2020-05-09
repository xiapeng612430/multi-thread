package executors.executors_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 5:49 下午
 */
public class Run2 {

    public static void main(String[] args) {
        ExecutorService executorServices = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorServices.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("run!");
                }
            });
        }
    }
}
