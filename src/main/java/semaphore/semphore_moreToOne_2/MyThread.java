package semaphore.semphore_moreToOne_2;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 01:06
 */
public class MyThread extends Thread {
private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.sayHello();
    }
}
