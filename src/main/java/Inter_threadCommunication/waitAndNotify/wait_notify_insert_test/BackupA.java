package Inter_threadCommunication.waitAndNotify.wait_notify_insert_test;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 22:34
 */
public class BackupA extends Thread {

    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
