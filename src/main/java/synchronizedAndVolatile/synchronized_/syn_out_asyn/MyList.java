package synchronizedAndVolatile.synchronized_.syn_out_asyn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:56
 */
public class MyList {

    private List list = new ArrayList();

    synchronized public void add(String username) {
        System.out.println("thread name = " + Thread.currentThread().getName() + " run  add method");
        list.add(username);
        System.out.println("thread name = " + Thread.currentThread().getName() + " exit add method");
    }

    synchronized public int getSize() {
        System.out.println("thread name = " + Thread.currentThread().getName() + " run  getSize method");
        int size = list.size();
        System.out.println("thread name = " + Thread.currentThread().getName() + " exit getSize method");
        return size;
    }
}
