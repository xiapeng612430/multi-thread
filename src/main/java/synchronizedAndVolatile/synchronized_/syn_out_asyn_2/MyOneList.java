package synchronizedAndVolatile.synchronized_.syn_out_asyn_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:18
 */
public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }

}
