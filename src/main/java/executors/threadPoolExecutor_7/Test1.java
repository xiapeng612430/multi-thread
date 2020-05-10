package executors.threadPoolExecutor_7;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 10:26 上午
 */
public class Test1 {

    public static void main(String[] args) {
        MyRunnableA a = new MyRunnableA("中国");
        MyRunnableA b = new MyRunnableA("美国");
        MyRunnableA c = new MyRunnableA("日本");
        MyRunnableA d = new MyRunnableA("俄罗斯");

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 99999L, TimeUnit.SECONDS, new SynchronousQueue<>());

        threadPoolExecutor.execute(a);
        threadPoolExecutor.execute(b);
        threadPoolExecutor.execute(c);
        threadPoolExecutor.execute(d);

    }
}
