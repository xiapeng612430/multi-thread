package collection.nonBlocking.concurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @date 2020/05/28
 * @time 14:59
 */
public class MyService {

    public ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap<>();

    public MyService() {
        UserInfo userInfo1 = new UserInfo(1, "u1");
        UserInfo userInfo2 = new UserInfo(3, "u2");
        UserInfo userInfo3 = new UserInfo(5, "u3");
        UserInfo userInfo4 = new UserInfo(4, "u4");
        UserInfo userInfo5 = new UserInfo(2, "u5");

        concurrentSkipListMap.put(userInfo1, "V1");
        concurrentSkipListMap.put(userInfo2, "V2");
        concurrentSkipListMap.put(userInfo3, "V3");
        concurrentSkipListMap.put(userInfo4, "V4");
        concurrentSkipListMap.put(userInfo5, "V5");
    }
}
