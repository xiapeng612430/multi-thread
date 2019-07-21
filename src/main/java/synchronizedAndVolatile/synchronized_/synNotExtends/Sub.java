package synchronizedAndVolatile.synchronized_.synNotExtends;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:34
 */
public class Sub extends Main {

    @Override
    public void serviceMethod() {
        try {
            System.out.println("in sub 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("in sub 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
