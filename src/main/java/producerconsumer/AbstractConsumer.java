package producerconsumer;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:09 PM
 */
public class AbstractConsumer implements Consumer,Runnable{

    @Override
    public void run() {
        while (true){
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    @Override
    public void consume() throws InterruptedException {

    }
}
