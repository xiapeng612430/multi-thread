package Inter_threadCommunication.waitAndNotify.test_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:36
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
