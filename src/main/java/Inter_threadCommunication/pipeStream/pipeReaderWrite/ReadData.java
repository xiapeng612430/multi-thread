package Inter_threadCommunication.pipeStream.pipeReaderWrite;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 21:27
 */
public class ReadData {

    public void readMethod(PipedReader input) {
        try {
            System.out.println("read : ");
            char[] chars = new char[20];
            int readLength = input.read(chars);
            while (readLength != -1) {
                String newData = new String(chars, 0, readLength);
                System.out.println(newData);
                readLength = input.read(chars);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
