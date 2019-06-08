package Inter_threadCommunication.waitAndNotify.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 01:56
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add() {
        list.add("ant string");
    }

    public static int size() {
        return list.size();
    }
}
