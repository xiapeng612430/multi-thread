package synchronizedAndVolatile.volatile_.synchronizedUpdateNewValue;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:34
 */
public class Service {

    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun == true) {

        }
        System.out.println("can not stop");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
