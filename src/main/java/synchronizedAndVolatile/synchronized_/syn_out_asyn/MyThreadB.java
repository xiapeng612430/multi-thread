package synchronizedAndVolatile.synchronized_.syn_out_asyn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:08
 */
public class MyThreadB extends Thread {

    private MyList list;

    public MyThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            list.add("threadB" + (i + 1));
        }
    }
}
