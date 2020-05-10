package executors.policy_callerRunsPolicy_2;

/**
 * Created by xianpeng.xia
 * on 2020/5/10 2:59 下午
 */
public class Run {

    public static void main(String[] args) {
        MyThreadA myThreadA = new MyThreadA();
        myThreadA.setName("AA");
        myThreadA.start();
        System.out.println("main end !");
    }
}
