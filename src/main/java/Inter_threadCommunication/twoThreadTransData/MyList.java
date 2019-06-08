package Inter_threadCommunication.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 23:08
 */
public class MyList {

    private List list = new ArrayList();

    synchronized  public void add() {
        list.add("a");
    }

    synchronized  public int size() {
        return list.size();
    }
}
