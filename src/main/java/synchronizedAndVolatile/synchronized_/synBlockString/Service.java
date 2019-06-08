package synchronizedAndVolatile.synchronized_.synBlockString;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:24
 */
public class Service {

    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString){
                System.out.println("thread name : "+Thread.currentThread().getName()+" in -> "+System.currentTimeMillis() +" enter synchronized block");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("thread name : "+Thread.currentThread().getName()+" in -> "+System.currentTimeMillis() +" leave synchronized block");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
