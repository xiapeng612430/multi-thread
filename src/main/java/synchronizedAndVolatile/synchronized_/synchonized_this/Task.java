package synchronizedAndVolatile.synchronized_.synchonized_this;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 10:59
 */
public class Task {

    public void otherMethod() {
        System.out.println("--------run------otherMethod-------------");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 50000; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i= " + (i + 1));
            }
        }
    }
}
