package collection.blocking.synchronousQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 9:43 下午
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            ThreadPut threadPut = new ThreadPut(myService);
            ThreadTake threadTake = new ThreadTake(myService);
            threadTake.start();
            Thread.sleep(1000);
            threadPut.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
