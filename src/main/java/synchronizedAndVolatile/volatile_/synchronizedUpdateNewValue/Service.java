package synchronizedAndVolatile.volatile_.synchronizedUpdateNewValue;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:34
 */
public class Service {

    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();
        while (isContinueRun == true) {
            synchronized (anyString) {
            }
        }
        System.out.println("stopped");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
