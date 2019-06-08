package synchronizedAndVolatile.synchronized_.syn_out_asyn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:07
 */
public class MyThreadA extends Thread {

    private MyList list;

    public MyThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            list.add("threadA" + (i + 1));
        }
    }
}
