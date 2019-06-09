package Inter_threadCommunication.pipeStream.pipeReaderWrite;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import sun.awt.windows.ThemeReader;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 21:34
 */
public class Run {

    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader inputStrteam = new PipedReader();
            PipedWriter outputStream = new PipedWriter();

            outputStream.connect(inputStrteam);

            ThreadRead threadRead = new ThreadRead(readData, inputStrteam);
            threadRead.start();

            Thread.sleep(2000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
