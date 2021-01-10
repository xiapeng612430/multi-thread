package atomic;


import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author xianpeng.xia
 * on 2021/1/10 下午7:55
 */
public class AtomicIntegerFieldUpdaterTest implements Runnable {

    static Candidate tom;
    static Candidate peter;

    public static AtomicIntegerFieldUpdater<Candidate> scoreUpdater = AtomicIntegerFieldUpdater.newUpdater(Candidate.class, "score");

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            peter.score++;
            scoreUpdater.getAndIncrement(tom);
        }
    }

    public static class Candidate {

        volatile int score;
    }

    public static void main(String[] args) throws InterruptedException {
        tom = new Candidate();
        peter = new Candidate();
        AtomicIntegerFieldUpdaterTest runable = new AtomicIntegerFieldUpdaterTest();

        Thread thread = new Thread(runable);
        Thread thread1 = new Thread(runable);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(tom.score);
        System.out.println(peter.score);
    }
}
