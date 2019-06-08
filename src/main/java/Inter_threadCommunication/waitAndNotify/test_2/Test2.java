package Inter_threadCommunication.waitAndNotify.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:40
 */
public class Test2 {

    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("before syn");
            synchronized (lock){
                System.out.println("first row in syn");
                lock.wait();
                System.out.println("after wait first row");
            }
            System.out.println("after syn first row");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
