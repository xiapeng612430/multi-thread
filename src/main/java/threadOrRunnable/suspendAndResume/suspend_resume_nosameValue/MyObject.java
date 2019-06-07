package threadOrRunnable.suspendAndResume.suspend_resume_nosameValue;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 12:22
 */
public class MyObject {

    private String username = "1";
    private String password = "11";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("stop thread a");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
