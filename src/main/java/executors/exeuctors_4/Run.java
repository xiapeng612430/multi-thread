package executors.exeuctors_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 7:49 下午
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
    }
}
