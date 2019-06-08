package synchronizedAndVolatile.synchronized_.setNewPropertiesLockOne;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:53
 */
public class UserInfo {

    private String username;
    private String password;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
}
