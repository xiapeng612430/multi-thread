package Inter_threadCommunication.waitAndNotify.wait_notify_insert_test;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 22:35
 */
public class BackupB extends Thread {

    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
