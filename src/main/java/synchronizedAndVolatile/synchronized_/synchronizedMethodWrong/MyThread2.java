package synchronizedAndVolatile.synchronized_.synchronizedMethodWrong;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 22:04
 */
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
