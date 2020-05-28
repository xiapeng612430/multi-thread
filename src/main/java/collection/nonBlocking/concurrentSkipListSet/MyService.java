package collection.nonBlocking.concurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @date 2020/05/28
 * @time 15:27
 */
public class MyService {

    public ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet<>();

    public MyService() {
        UserInfo userInfo1 = new UserInfo(1, "username1");
        UserInfo userInfo2 = new UserInfo(3, "username3");
        UserInfo userInfo3 = new UserInfo(5, "username5");
        UserInfo userInfo4 = new UserInfo(4, "username4");
        UserInfo userInfo5 = new UserInfo(4, "username4");
        UserInfo userInfo6 = new UserInfo(2, "username2");

        concurrentSkipListSet.add(userInfo1);
        concurrentSkipListSet.add(userInfo2);
        concurrentSkipListSet.add(userInfo3);
        concurrentSkipListSet.add(userInfo4);
        concurrentSkipListSet.add(userInfo5);
        concurrentSkipListSet.add(userInfo6);
    }
}
