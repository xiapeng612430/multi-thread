package collection.nonBlocking.concurrentSkipListMap;

/**
 * @date 2020/05/28
 * @time 14:56
 */
public class UserInfo implements Comparable<UserInfo> {

    private int id;
    private String username;

    public UserInfo(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(UserInfo o) {
        if (this.getId() < o.getId()) {
            return -1;
        }
        if (this.getId() > o.getId()) {
            return 1;
        }
        return 0;
    }
}
