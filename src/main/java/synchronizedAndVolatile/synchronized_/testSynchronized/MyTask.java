package synchronizedAndVolatile.synchronized_.testSynchronized;

import synchronizedAndVolatile.synchronized_.selfPrivate.ThreadB;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 09:50
 */
public class MyTask {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronnized threadName = "+ Thread.currentThread().getName() + " i = "+i);
        }
        System.out.println("");

        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println("synchronnized threadName = "+ Thread.currentThread().getName() + " i = "+i);
            }
        }
    }

}
