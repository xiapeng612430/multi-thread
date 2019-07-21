package synchronizedAndVolatile.synchronized_.testSynchronized;

import synchronizedAndVolatile.synchronized_.selfPrivate.ThreadB;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 09:52
 */
public class MyThread1 extends Thread {

    private MyTask task;

    public MyThread1(MyTask task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
