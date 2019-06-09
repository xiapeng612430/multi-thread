package Inter_threadCommunication.pipeStream.pipeInputStream;

import java.io.PipedOutputStream;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 20:22
 */
public class ThreadWrite extends Thread {

    private WriteData writeData;
    private PipedOutputStream pipedOutputStream;

    public ThreadWrite(WriteData writeData, PipedOutputStream pipedOutputStream) {
        this.writeData = writeData;
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(pipedOutputStream);
    }
}
