package completionService.executorCompletionService_4;

/**
 * Created by xianpeng.xia
 * on 2020/5/15 11:26 下午
 */
public class UserInfo {

    private String username;
    private String password;

    public UserInfo() {
    }

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
