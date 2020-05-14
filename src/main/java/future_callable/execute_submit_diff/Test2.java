package future_callable.execute_submit_diff;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/14 11:41 下午
 */
public class Test2 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                Integer.parseInt("a");
            }
        });


    }
}
