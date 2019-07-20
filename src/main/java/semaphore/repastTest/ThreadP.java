package semaphore.repastTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:28
 */
public class ThreadP extends Thread {
private RepastService repastService;

    public ThreadP(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.set();
    }
}
