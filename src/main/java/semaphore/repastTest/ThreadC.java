package semaphore.repastTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:29
 */
public class ThreadC extends Thread {

    private RepastService repastService;

    public ThreadC(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.get();
    }
}
