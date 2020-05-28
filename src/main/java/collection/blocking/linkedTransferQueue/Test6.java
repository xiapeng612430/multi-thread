package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 11:03 下午
 */
public class Test6 {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            for (int i = 0; i < 10; i++) {
                ThreadA threadA = new ThreadA(myService);
                threadA.setName("A");
                threadA.start();
            }

            Thread.sleep(1000);
            System.out.println("有没有线程正在等待数据: " + myService.transferQueue.hasWaitingConsumer());
            System.out.println("有 " + myService.transferQueue.getWaitingConsumerCount() + " 个线程正在等待数据");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
