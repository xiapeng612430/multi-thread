package scheduledThreadPoolExecutor.scheduledThreadPoolExecutor_3;

import java.util.concurrent.Callable;

/**
 * Created by xianpeng.xia
 * on 2020/5/18 10:49 下午
 */
public class MyCallable  implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("MyCallable run "+System.currentTimeMillis());
        return "a";
    }
}
