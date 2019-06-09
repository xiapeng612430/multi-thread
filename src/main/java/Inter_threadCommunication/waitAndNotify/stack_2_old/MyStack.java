package Inter_threadCommunication.waitAndNotify.stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 19:05
 */
public class MyStack {

    private List list = new ArrayList();

    synchronized public void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notify();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String returnString = "";
        try {
            while (list.size() == 0) {
                System.out.println("pop操作中的" + Thread.currentThread().getName() + " 线程呈wait状态");
                this.wait();
            }
            returnString = list.get(0) + "";
            list.remove(0);
            this.notify();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnString;
    }
}
