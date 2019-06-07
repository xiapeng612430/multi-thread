package threadOrRunnable.stopThread.stopThrowLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 11:01
 */
public class SynchrobnizedObject {

    private String username = "a";
    private String password = "aa";


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
