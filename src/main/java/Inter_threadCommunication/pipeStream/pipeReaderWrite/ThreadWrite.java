package Inter_threadCommunication.pipeStream.pipeReaderWrite;

import java.io.PipedWriter;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 21:32
 */
public class ThreadWrite extends Thread {

    private WriteData writeData;
    private PipedWriter pipedWriter;

    public ThreadWrite(WriteData writeData, PipedWriter pipedWriter) {
        this.writeData = writeData;
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {
        writeData.writeMethod(pipedWriter);
    }
}
