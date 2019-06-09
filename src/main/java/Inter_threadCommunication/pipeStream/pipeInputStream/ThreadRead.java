package Inter_threadCommunication.pipeStream.pipeInputStream;

import java.io.PipedInputStream;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 20:24
 */
public class ThreadRead extends Thread {

    private ReadData readData;
    private PipedInputStream pipedInputStream;

    public ThreadRead(ReadData readData, PipedInputStream pipedInputStream) {
        this.readData = readData;
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        readData.readMethod(pipedInputStream);
    }
}
