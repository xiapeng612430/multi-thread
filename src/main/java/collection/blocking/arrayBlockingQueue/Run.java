package collection.blocking.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @date 2021/01/12
 * @time 14:47
 */
public class Run {

    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
        Thread t1 = new Thread(new Interviewee(queue));
        Thread t2 = new Thread(new Interviewer(queue));
        t1.start();
        t2.start();
    }
}

class Interviewee implements Runnable {

    BlockingQueue<String> queue;

    public Interviewee(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                String msg = "Interviewer " + i;
                queue.put(msg);
                System.out.println(System.currentTimeMillis() + " Join: " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            queue.put("End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Interviewer implements Runnable {

    BlockingQueue<String> queue;

    public Interviewer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String msg;
        try {
            while (!(msg = queue.take()).equals("End")) {
                System.out.println(System.currentTimeMillis() + " End: " + msg);
            }
            System.out.println(System.currentTimeMillis() + " End");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


