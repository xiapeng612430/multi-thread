package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:58 下午
 */
public class Test4 {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadD threadD = new ThreadD(myService);
            threadD.setName("D");
            threadD.start();
            Thread.sleep(4000);
            System.out.println("size " + myService.transferQueue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
