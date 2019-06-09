package Inter_threadCommunication.pipeStream.pipeReaderWrite;

import java.io.PipedReader;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 21:33
 */
public class ThreadRead extends Thread {

    private ReadData readData;
    private PipedReader pipedReader;

    public ThreadRead(ReadData readData, PipedReader pipedReader) {
        this.readData = readData;
        this.pipedReader = pipedReader;
    }

    @Override
    public void run() {
        readData.readMethod(pipedReader);
    }
}
