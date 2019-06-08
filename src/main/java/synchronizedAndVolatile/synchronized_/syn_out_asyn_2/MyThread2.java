package synchronizedAndVolatile.synchronized_.syn_out_asyn_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:23
 */
public class MyThread2 extends Thread {

    private MyOneList myOneList;

    public MyThread2(MyOneList myOneList) {
        super();
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        MyService myservice = new MyService();
        myservice.addServiceMethod(myOneList, "B");
    }
}
