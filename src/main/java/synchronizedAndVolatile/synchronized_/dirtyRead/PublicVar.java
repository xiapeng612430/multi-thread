package synchronizedAndVolatile.synchronized_.dirtyRead;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:33
 */
public class PublicVar {

    public String username = "A";
    public String password = "AA";

    synchronized public void setVaule(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " username= " + username + " password= " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized  public void getVaule(){
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username= " + username + " password= " + password);
    }
}
