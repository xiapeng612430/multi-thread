package threadlocal;

/**
 * @date 2021/01/07
 * @time 下午4:38
 */
public class ThreadLocalPassParameters {

    public static void main(String[] args) {
        new ServiceA().process();
    }
}

class UserContextHolder {

    public static ThreadLocal<User> threadLocalUser = new ThreadLocal<>();
}

class ServiceA {

    void process() {
        User user = new User("A");
        UserContextHolder.threadLocalUser.set(user);
        System.out.println("A user : " + user);
        new ServiceB().process();
    }
}

class ServiceB {

    void process() {
        User user = UserContextHolder.threadLocalUser.get();
        System.out.println("B user : " + user);
        new ServiceC().process();
    }
}

class ServiceC {

    void process() {
        User user = UserContextHolder.threadLocalUser.get();
        System.out.println("C user : " + user);
    }
}

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            '}';
    }
}
