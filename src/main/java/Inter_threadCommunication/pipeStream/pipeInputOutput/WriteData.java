package Inter_threadCommunication.pipeStream.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 20:12
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
