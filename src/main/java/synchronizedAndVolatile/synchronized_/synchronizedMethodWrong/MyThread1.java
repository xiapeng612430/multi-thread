package synchronizedAndVolatile.synchronized_.synchronizedMethodWrong;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 22:02
 */
public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
