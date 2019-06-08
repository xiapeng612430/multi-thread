package synchronizedAndVolatile.volatile_.synchronizedUpdateNewValue;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:41
 */
public class Run {

    public static void main(String[] args) {
        try {
            Service service= new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB(service);
            b.start();
            System.out.println("has send stop");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
