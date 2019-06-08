package synchronizedAndVolatile.synchronized_.syn_out_asyn_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:20
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
