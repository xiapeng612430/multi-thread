package producerconsumer.waitnotify;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author xianpeng.xia
 * on 2022/3/13 4:43 PM
 */
public class Run {

    public static void main(String[] args) {
        Queue<Product> queue = new ArrayDeque<>();

        for (int i = 0; i < 2; i++) {
            new Thread(new Producer(queue, 5)).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new Consumer(queue, 5)).start();
        }

    }
}
