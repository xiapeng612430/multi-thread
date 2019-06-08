package synchronizedAndVolatile.synchronized_.synchonized_this;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:04
 */
public class MyThread2 extends Thread {
private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
