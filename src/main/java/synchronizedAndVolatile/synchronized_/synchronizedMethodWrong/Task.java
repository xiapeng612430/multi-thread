package synchronizedAndVolatile.synchronized_.synchronizedMethodWrong;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:57
 */
public class Task {

    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程调用的值1 threadName = " + Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程调用的值2 threadName = " + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
