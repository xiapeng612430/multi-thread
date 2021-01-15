package cache;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @date 2021/01/15
 * @time 15:19
 * 使用装饰器模式,计算过程不放入缓存逻辑
 */
public class ICache<A, V> implements Computable<A, V> {

    // 保证线程安全
    private final Map<A, Future<V>> cache = new ConcurrentHashMap<>();
    // 计算实现
    private final Computable<A, V> c;
    // 定时清除缓存
    public final static ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(5);

    public ICache(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public V compute(A arg) throws Exception {
        //System.out.println(System.currentTimeMillis() + " " + Thread.currentThread().getName() + " 进入缓存机制");
        // 计算失败重试
        while (true) {
            Future<V> f = cache.get(arg);
            // 相同参数的线程同时请求,第二个以后的线程获取val就不为空,task只会执行一次
            if (f == null) {
                FutureTask<V> ft = new FutureTask<>(() -> c.compute(arg));
                // 如果有并发请求,只会有一个ft放入cache中并返回
                f = cache.putIfAbsent(arg, ft);
                // cache中为空才执行计算
                if (f == null) {
                    f = ft;
                    System.out.println("从FutureTask调用了计算函数,arg: " + arg);
                    ft.run();
                }
            }
            // 返回结果
            try {
                return f.get();
            } catch (CancellationException e) {
                System.out.println("被取消了");
                // 解决缓存污染问题
                cache.remove(arg);
                throw e;
            } catch (InterruptedException e) {
                System.out.println("被打断了");
                // 解决缓存污染问题
                cache.remove(arg);
                throw e;
            } catch (ExecutionException e) {
                System.out.println("计算错误");
                // 解决缓存污染问题,计算失败一直重试
                cache.remove(arg);
            }
        }

    }

    /**
     * @param arg    key
     * @param expire 过期时间
     * @return 值
     * @throws Exception
     */
    public V compute(A arg, long expire) throws Exception {
        if (expire > 0) {
            scheduledExecutorService.schedule(
                () -> {
                    expire(arg);
                }, expire, TimeUnit.SECONDS);
        }
        return compute(arg);
    }

    /**
     * @param arg key
     * @return value
     * @throws Exception 随机生成缓存时间,避免高并发缓存击穿,缓存雪崩问题
     */
    public V computeRandomExpire(A arg) throws Exception {
        long randomExipre = (long) Math.random() * 1000;
        return compute(arg, randomExipre);
    }

    public void expire(A key) {
        Future<V> future = cache.get(key);
        if (future != null) {
            if (!future.isDone()) {
                System.out.println("Future任务被取消");
                future.cancel(true);
            }
            System.out.println("缓存时间到,清除key: " + key);
            cache.remove(key);
        }
    }

    public static void main(String[] args) throws Exception {
        ICache<String, Integer> cache = new ICache<>(new ExpensiveFunction());
        new Thread(() -> {
            try {
                System.out.println(System.currentTimeMillis() + " 1-1结果 " + cache.compute("1", 5));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println(System.currentTimeMillis() + " 2-1结果 " + cache.compute("2"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println(System.currentTimeMillis() + " 1-2结果 " + cache.compute("1"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(6000L);
        System.out.println(System.currentTimeMillis() + " 1-3结果: " + cache.compute("1"));
    }
}
