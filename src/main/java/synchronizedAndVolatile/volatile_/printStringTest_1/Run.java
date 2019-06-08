package synchronizedAndVolatile.volatile_.printStringTest_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 21:12
 */
public class Run {

    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("i want to stop print " + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
