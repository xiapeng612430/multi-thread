package semaphore.repastTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 02:29
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        RepastService repastService = new RepastService();
        ThreadP[] arrayP = new ThreadP[60];
        ThreadC[] arrayC = new ThreadC[60];

        for (int i = 0; i < 60; i++) {
            arrayP[i] = new ThreadP(repastService);
            arrayC[i] = new ThreadC(repastService);
        }
        Thread.sleep(2000);
        for (int i = 0; i < 60; i++) {
            arrayP[i].start();
            arrayC[i].start();
        }
    }
}
