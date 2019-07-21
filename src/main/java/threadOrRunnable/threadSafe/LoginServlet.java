package threadOrRunnable.threadSafe;

/**
 * Created by xianpeng.xia
 * on 2019-06-03 07:31
 */
public class LoginServlet {

    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username : " + usernameRef + ",password : " + passwordRef);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
