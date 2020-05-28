package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 11:01 下午
 */
public class Test5 {

    public static void main(String[] args) {
        MyService myService = new MyService();
        try {
            ThreadE threadE = new ThreadE(myService);
            threadE.setName("E");
            threadE.start();

            Thread.sleep(500);
            System.out.println("size: "+myService.transferQueue.size());
            Thread.sleep(8000);
            System.out.println("size: "+myService.transferQueue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
