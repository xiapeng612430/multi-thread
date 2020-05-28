package collection.blocking.delayQueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 9:47 下午
 */
public class UserInfo implements Delayed {

    private long delayNanoTime;
    private String username;

    public UserInfo(long delayTime, String username) {
        TimeUnit unit = TimeUnit.SECONDS;
        delayNanoTime = System.nanoTime() + unit.toNanos(delayTime);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public long getDelayNanoTime() {
        return delayNanoTime;
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(delayNanoTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }


    @Override
    public int compareTo(Delayed o) {
        if (this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS) < 0) {
            return -1;
        }
        if (this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS) >0){
            return 1;
        }
        return 0;
    }
}
