package Inter_threadCommunication.wait_notify_insert_test;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 21:47
 */
public class DBTools {

    //==false确保 备份a先执行
    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA == true) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("*****");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (prevIsA == false) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("&&&&&");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
