package collection.blocking.linkedTransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:26 下午
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB myServiceB = new MyServiceB();
            ThreadB threadB = new ThreadB(myServiceB);
            threadB.setName("B");
            threadB.start();
            Thread.sleep(3000);
            System.out.println("size: " + myServiceB.transferQueue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
