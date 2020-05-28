package collection.blocking.synchronousQueue;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 9:41 下午
 */
public class Test {

    public static void main(String[] args) {
        try {
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            System.out.println("step1");
            synchronousQueue.put("anyString");
            System.out.println("step2");
            System.out.println(synchronousQueue.take());
            System.out.println("step3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
