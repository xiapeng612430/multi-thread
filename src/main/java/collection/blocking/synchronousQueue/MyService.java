package collection.blocking.synchronousQueue;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 9:36 下午
 */
public class MyService {

    public SynchronousQueue synchronousQueue = new SynchronousQueue();

    public void put() {
        try {
            String putString = "anyString" + Math.random();
            System.out.println("put: " + putString);
            synchronousQueue.put(putString);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void take() {
        try {
            System.out.println("take: " + synchronousQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
