package synchronizedAndVolatile.synchronized_.syn_out_asyn_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:22
 */
public class MyThread1 extends Thread {

    private MyOneList list;

    public MyThread1(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService myservice = new MyService();
        myservice.addServiceMethod(list, "A");
    }
}
