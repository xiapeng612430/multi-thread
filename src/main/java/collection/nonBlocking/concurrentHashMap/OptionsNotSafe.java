package collection.nonBlocking.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xianpeng.xia
 * on 2021/1/12 上午12:05
 */
public class OptionsNotSafe implements Runnable {

    private static ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Integer oldScore = scores.get("A");
            Integer newScore = oldScore + 1;
            scores.put("A", newScore);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OptionsNotSafe.scores.put("A", 0);

        Thread t1 = new Thread(new OptionsNotSafe());
        Thread t2 = new Thread(new OptionsNotSafe());
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(OptionsNotSafe.scores);
    }
}
