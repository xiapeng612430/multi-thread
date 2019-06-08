package synchronizedAndVolatile.synchronized_.synchonized_this;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:03
 */
public class MyThread1 extends Thread{
private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
