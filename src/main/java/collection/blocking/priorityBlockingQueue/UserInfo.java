package collection.blocking.priorityBlockingQueue;

/**
 * @date 2020/05/28
 * @time 18:34
 */
public class UserInfo implements Comparable<UserInfo> {

    private int id;

    public UserInfo() {
    }

    public UserInfo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(UserInfo o) {
        if (this.id < o.getId()) {
            return -1;
        }
        if (this.id > o.getId()) {
            return 1;
        }
        return 0;
    }
}
