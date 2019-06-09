package Inter_threadCommunication.pipeStream.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 20:15
 */
public class ReadData {

    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read :");
            byte[] bytes = new byte[20];
            int readLength = input.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.println(newData);
                readLength = input.read(bytes);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
