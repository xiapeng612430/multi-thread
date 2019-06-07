package synchronizedAndVolatile.synchronized_.synLockIn_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:58
 */
public class Sub extends Main {

    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i= " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
