package Inter_threadCommunication.waitAndNotify.wait_notify_insert_test;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 22:37
 */
public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 10; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }

}
