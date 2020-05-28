package collection.blocking.linkedTransferQueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * Created by xianpeng.xia
 * on 2020/5/28 10:24 下午
 */
public class MyServiceB {

    public TransferQueue transferQueue = new LinkedTransferQueue();

    public MyServiceB() {
    }
}
