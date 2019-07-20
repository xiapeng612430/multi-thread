package semaphore.semphore_pool_list;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 01:32
 */
public class MyThread extends Thread {

    private ListPool listPool;

    public MyThread(ListPool listPool) {
        super();
        this.listPool = listPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName() + " get value : " + getString);
            listPool.put(getString);
        }
    }
}
