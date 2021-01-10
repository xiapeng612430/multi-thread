package atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author xianpeng.xia
 * on 2021/1/10 下午7:16
 */
public class AtomicArray {

    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerArray array = new AtomicIntegerArray(1000);
        Incrementer incrementer = new Incrementer(array);
        Decrementer decrementer = new Decrementer(array);
        Thread[] incrementerThreads = new Thread[100];
        Thread[] decrementerThreads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            incrementerThreads[i] = new Thread(incrementer);
            decrementerThreads[i] = new Thread(decrementer);
            incrementerThreads[i].start();
            decrementerThreads[i].start();
        }

        for (int i = 0; i < 100; i++) {
            incrementerThreads[i].join();
            decrementerThreads[i].join();
        }

        for (int i = 0; i < array.length(); i++) {
            int var = array.get(i);
            if (var != 0) {
                System.out.println(var);
            }
        }
    }
}

class Decrementer implements Runnable {

    private AtomicIntegerArray array;

    public Decrementer(AtomicIntegerArray array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length(); i++) {
            array.getAndDecrement(i);
        }
    }
}

class Incrementer implements Runnable {

    private AtomicIntegerArray array;

    public Incrementer(AtomicIntegerArray array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length(); i++) {
            array.getAndIncrement(i);
        }
    }
}

